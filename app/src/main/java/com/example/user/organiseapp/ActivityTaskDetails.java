package com.example.user.organiseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityTaskDetails extends AppCompatActivity {

    TextView task_title_detail;
    TextView text_description;
    TextView text_due_date;
    CheckBox completeCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);

        task_title_detail = (TextView)findViewById(R.id.task_title_detail);
        text_description = (TextView)findViewById(R.id.task_description);
        text_due_date = (TextView) findViewById(R.id.text_due_date);
        completeCheckbox = (CheckBox) findViewById(R.id.completeCheckbox);
    }

}
