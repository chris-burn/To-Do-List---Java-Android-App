package com.example.user.organiseapp;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityTaskDetails extends AppCompatActivity {

    Task task;
    TextView title;
    TextView description;
    TextView due_date;
    CheckBox complete;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String task = extras.getString("task");

        title = (TextView)findViewById(R.id.task_title_detail);
        description = (TextView)findViewById(R.id.task_description);
        due_date = (TextView)findViewById(R.id.text_due_date);
        complete = (CheckBox) findViewById(R.id.completeCheckbox);

        title.setText(task.getTitle().toString());
        description.setText();
        due_date.setText();
        complete.setText();

    }

}
