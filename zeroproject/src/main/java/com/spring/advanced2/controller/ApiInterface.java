package com.spring.advanced2.controller;

import com.spring.advanced2.model.Advice;
import com.spring.advanced2.model.Chuck;
import com.spring.advanced2.model.MovieResults;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("/3/movie/{category}")
    Call<MovieResults> getMovies(
            @Path("category") String category,
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET("jokes/random/")
    Call<Chuck> getJoke();

    @GET("/advice")
    Call<Advice> getAdvice();


}
