package com.example.user.organiseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityTitle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
    }

    public void onViewAllButtonClicked(View button){
        Intent intent = new Intent(this, ActivityList.class);
        startActivity(intent);
    }

    public void onSaveNewButtonClicked(View button){
        Intent intent = new Intent(this, ActivityLogTask.class);
        startActivity(intent);
    }




}
