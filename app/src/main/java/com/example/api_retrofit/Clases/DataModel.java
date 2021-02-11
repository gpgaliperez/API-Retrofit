package com.example.api_retrofit.Clases;

import com.google.gson.annotations.SerializedName;

public class DataModel {
    //Which is used as JSON model (POJO)

    //This class will be as a template for the data that we are going to parse
    private String title;
    private String url;
    private String type;

   // @SerializedName("completed")  //its referes to "completed" found in JSON
    //private boolean completed;


    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }
}
