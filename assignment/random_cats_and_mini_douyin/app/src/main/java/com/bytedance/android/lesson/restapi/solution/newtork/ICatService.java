package com.bytedance.android.lesson.restapi.solution.newtork;


import com.bytedance.android.lesson.restapi.solution.bean.Cat;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * @author Xavier.S
 * @date 2019.01.15 16:42
 */
public interface ICatService {
    // TODO-C1 (2) Implement your Cat Request here, url: https://api.thecatapi.com/v1/images/search?limit=5
    //Retrofit retrofit = new Retrofit.Builder()
    //        .baseUrl("https://api.thecatapi.com/")
    //        .addConverterFactory(GsonConverterFactory.create())
    //        .build();
    //Response<Cat> response  = retrofit.create(ICatService.class).randomCat().execute();
    //return response == null ? null :  response.body();

    @GET("v1/images/search?limit=5") Call<List<Cat>> randomCat();
}
