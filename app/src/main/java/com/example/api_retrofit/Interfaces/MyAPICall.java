package com.example.api_retrofit.Interfaces;

import com.example.api_retrofit.Clases.DataModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPICall {
    // That define the possible HTTP operations

    //@GET("90fea295-8b4d-4e7c-be1e-f0788188102f")
    @GET("events/801255?client_id=MjE1Mzk3MDJ8MTYxMzAwMTQ3OC4zNDE5MzU0")
    Call<DataModel> getData();

}
