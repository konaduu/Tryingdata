package com.example.newdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        UserDao userDao = MainApp.myDb().userDao();

//        sending a request
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "");
        jsonObject.addProperty("password", "");




//        making a post request
        Ion.with(this)
                .load("POST", "")
                .setJsonObjectBody(jsonObject)
                .asJsonObject()
                .withResponse()
                .setCallback(new FutureCallback<Response<JsonObject>>() {
                    @Override
                    public void onCompleted(Exception e, Response<JsonObject> result) {

                    }
                });

    }
}