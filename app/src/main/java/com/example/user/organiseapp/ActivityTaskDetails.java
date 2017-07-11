package com.example.user.organiseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;


public class ActivityTaskDetails extends AppCompatActivity {

    TextView title;
    TextView description;
    TextView due_date;
    CheckBox complete;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);

        title = (TextView)findViewById(R.id.task_title_detail);
        description = (TextView)findViewById(R.id.task_description);
        due_date = (TextView)findViewById(R.id.text_due_date);
//        complete = (CheckBox) findViewById(R.id.completeCheckbox);

        Task task = (Task)getIntent().getExtras().get("task");
        title.setText(task.getTitle());
        description.setText(task.getDescription());
        due_date.setText(task.getDueDate());
//        complete.setChecked(task.getComplete());

    }



}
