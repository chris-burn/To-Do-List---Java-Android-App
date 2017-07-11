package com.example.user.organiseapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ActivityList extends AppCompatActivity implements View.OnClickListener {

    ArrayList<Task> myTaskList;
    SharedPreferences sharedPref;
    Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasklist);

        sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
//        SharedPreferences.Editor delete = sharedPref.edit();
//        delete.clear();
//        delete.apply();
        String taskList = sharedPref.getString("MyTasks", new ArrayList<Task>().toString());
        Log.d("Tasks String", taskList);

        Gson gson = new Gson();
//        convert string back to whatever type required
//        TypeToken<Task>, convert back to Task only

        TypeToken<ArrayList<Task>> taskArrayList = new TypeToken<ArrayList<Task>>() {};
        myTaskList = gson.fromJson(taskList, taskArrayList.getType());
        Log.d("myFavourites", myTaskList.toString());
//        now have an ArrayList


        Log.d("myTasks", myTaskList.toString());
//        Added in newTask to Array

        if (getIntent().getExtras() != null) {
            Task newTask1 = (Task) getIntent().getExtras().get("newTask");
            myTaskList.add(newTask1);
        }

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("MyTasks", gson.toJson(myTaskList));
        editor.apply();
//        SAVES ENTRY TO MY TASK LIST

        TaskListAdapter taskListAdapter = new TaskListAdapter(this, myTaskList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(taskListAdapter);
    }


    public void onAddButtonClick(View button) {
        Intent intent = new Intent(this, ActivityLogTask.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View listItem) {
        Task task = (Task) listItem.getTag();
        Intent intent = new Intent(this, ActivityTaskDetails.class);
        intent.putExtra("task", task);
        startActivity(intent);
    }

}

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        super.onCreateOptionsMenu(menu);
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.main_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        if (item.getItemId() == R.id.Task_add){
//            Intent intent = new Intent(this, ActivityLogTask.class);
//            startActivity(intent);
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }





