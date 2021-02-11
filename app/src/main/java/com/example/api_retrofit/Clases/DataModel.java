package com.example.api_retrofit.Clases;

import com.google.gson.annotations.SerializedName;

public class DataModel {
    //Which is used as JSON model (POJO)

    //This class will be as a template for the data that we are going to parse
    private int userId;
    private int id;
    private String title;

   // @SerializedName("completed")  //its referes to "completed" found in JSON
    private boolean completed;


    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }
}
