package com.example.user.organiseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class ActivityLogTask extends AppCompatActivity {

    EditText new_text_title;
    EditText new_text_description;
    EditText due_date;
    Button save_button;
    CheckBox checkBox2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_task);

        new_text_title = (EditText)findViewById(R.id.new_task_title);
        new_text_description = (EditText)findViewById(R.id.new_task_description);
        due_date = (EditText) findViewById(R.id.due_date);
        save_button = (Button) findViewById(R.id.save_button);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);



    }
}
