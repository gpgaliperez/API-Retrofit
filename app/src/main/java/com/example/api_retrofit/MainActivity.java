package com.example.api_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.api_retrofit.Clases.DataModel;
import com.example.api_retrofit.Interfaces.MyAPICall;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
//TODO https://www.youtube.com/watch?v=gaPoV4z5wng&list=PL6Q9UqV2Sf1ieH5thfwVjEIqYUa4w5Y6N&index=9

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.text);

        // Instance which uses the interface an the Builder API to allow defining the URL end point for the HTTP operations
        // Retrofit Builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://run.mocky.io/v3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Instance for our Interface
        MyAPICall myAPICall = retrofit.create(MyAPICall.class);
        Call<DataModel> call = myAPICall.getData();

        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                if(response.code() != 200){
                    txt.setText("Check the connection");
                }else{

                    //Get the data into textView
                    String json = "";
                    json = "ID = " + response.body().getId() +
                            "\n userId = " + response.body().getUserId() +
                            "\n title = " + response.body().getTitle() +
                            "\n completed = " + response.body().isCompleted();

                    txt.append(json);
                }
            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {

            }
        });

    }

}

