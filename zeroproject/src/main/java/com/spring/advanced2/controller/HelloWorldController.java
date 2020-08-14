package com.spring.advanced2.controller;
import com.spring.advanced2.model.Advice;
import com.spring.advanced2.model.Chuck;
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
    public static String CHUCK_URL = "https://api.chucknorris.io/";
    public static String ADVICE_URL = "https://api.adviceslip.com/";


    @RequestMapping("/hello")
    public String firstPage() {
        return "Hello World";
    }

    @GetMapping("/topmovies")
    public MovieResults movies() throws IOException {
       return useAPI();
    }

    @GetMapping("/chuck")
    public Chuck norris() throws IOException{
        return useNorris();
    }

    @GetMapping("/advice")
    public Advice advice() throws IOException{
        return useAdvice();
    }

    protected Advice useAdvice() throws IOException{
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ADVICE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<Advice> call = apiInterface.getAdvice();
        Response<Advice> response = call.execute();
        return response.body();
    }

    protected Chuck useNorris() throws IOException{
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CHUCK_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<Chuck> call = apiInterface.getJoke();
        Response<Chuck> response = call.execute();
        return response.body();

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
