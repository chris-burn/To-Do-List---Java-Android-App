package com.example.user.organiseapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import java.util.Calendar;

public class ActivityLogTask extends AppCompatActivity implements View.OnClickListener {

    EditText new_text_title;
    EditText new_text_description;
//    EditText due_date;
    Button save_button;
    CheckBox completeBox;
    Button btnDatePicker;
    EditText txtDate;
    private int mYear, mMonth, mDay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_task);

        new_text_title = (EditText)findViewById(R.id.new_task_title);
        new_text_description = (EditText)findViewById(R.id.new_task_description);
//        due_date = (EditText) findViewById(R.id.due_date);
        save_button = (Button) findViewById(R.id.save_button);
        completeBox = (CheckBox) findViewById(R.id.completeBox);

        btnDatePicker=(Button)findViewById(R.id.date_button);
        txtDate=(EditText)findViewById(R.id.due_date);

        btnDatePicker.setOnClickListener(this);
    }


    @Override
    public void onClick(View button) {

        if (button == btnDatePicker) {

            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                            txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
    }


    public void onSaveButtonClick(View view){
        String newTitle = new_text_title.getText().toString();
        String newDescription = new_text_description.getText().toString();
        String newDueDate = txtDate.getText().toString();
        Boolean newComplete = completeBox.isChecked();

       Task newTask = new Task(newTitle, newDescription, newDueDate, newComplete);
//        now throw to Movie List
        Intent intent = new Intent(this, ActivityList.class);
        intent.putExtra("newTask", newTask);
        startActivity(intent);
    }


}
