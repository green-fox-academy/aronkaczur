package com.spring.advanced2.controller;
import com.spring.advanced2.model.MovieResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@RestController
@Component
@PropertySource("classpath:application.properties")
public class HelloWorldController {

    @Autowired
    private Environment env;
    public  static String BASE_URL = "https://api.themoviedb.org/";
    public static int PAGE = 1;
    public static String LANGUAGE="hu-HU";
    public static String CATEGORY = "popular";

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }

    @GetMapping("/topmovies")
    public MovieResults movies() throws IOException {
       return useAPI();
    }



    protected MovieResults useAPI() throws IOException {
        String API_KEY = env.getProperty("API_KEY");
       Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<MovieResults> call = apiInterface.getMovies(CATEGORY,API_KEY,LANGUAGE,PAGE);
        Response<MovieResults> response = call.execute();
        return response.body();



    }
}
