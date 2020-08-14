//package com.spring.advanced2.service;
//
//import com.spring.advanced2.controller.ApiInterface;
//import com.spring.advanced2.model.MovieResults;
//import retrofit2.Call;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//public class ApiService {
//
//    public  static String BASE_URL = "https://api.themoviedb.org/";
//    public static int PAGE = 1;
//    public static String API_KEY = "8746e3082760e99ce26e4222eacc162b";
//    public static String LANGUAGE="en-US";
//    public static String CATEGORY = "popular";
//
//    public void useAPI(){
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
//        Call<MovieResults> call = apiInterface.getMovies(CATEGORY,API_KEY,LANGUAGE,PAGE);
//
//    }
//
//}
