package com.example.user.organiseapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ActivityList extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<Task> myTaskList;
    private SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasklist);

        sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);

//        CLEAR SHARED PREFS WHEN REBOOT APP
//        SharedPreferences.Editor delete = sharedPref.edit();
//        delete.clear();
//        delete.apply();

        String taskList = sharedPref.getString("MyTasks", new ArrayList<Task>().toString());
        Log.d("Tasks String", taskList);

//        convert string back to type required
//        TypeToken<Task>, convert back to Task only

        Gson gson = new Gson();


//       now have an ArrayList
        TypeToken<ArrayList<Task>> taskArrayList = new TypeToken<ArrayList<Task>>() {};
        myTaskList = gson.fromJson(taskList, taskArrayList.getType());
        Log.d("myFavourites", myTaskList.toString());

        amendTaskList(myTaskList);

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("MyTasks", gson.toJson(myTaskList));
        editor.apply();

        TaskListAdapter taskListAdapter = new TaskListAdapter(this, myTaskList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(taskListAdapter);
    }


    public void amendTaskList(ArrayList<Task> list) {

//      check intent from LogTask or EditTask methods for Task (intent key)
//      if Task is present, Loop through string ArrayList (myTaskList) to see if instance of Task "newTask" already exists

        if (getIntent().getExtras() != null) {
//          assign variable to "newTask" instance key we want to add to Array
            Task newTask1 = (Task) getIntent().getExtras().get("newTask");

//        set boolean instance to check for presence of task in myTaskList (false default)
//        set counter to keep count on number of loops through array to dictate index place in array
//        Search on title of task through get.Title(), once found 'breaks'

            boolean found = false;
            int counter = 0;
            for(Task task:list) {
                if (task.getTitle().equals(newTask1.getTitle())) {
                    found = true;
                    break;
                }
                counter++;
            }

//        if exists, edit tasklist entry; if not add task to myTaskList
//        delete existing entry at index number dictated by counter
//        reinstate edited task at same index number

            if(found){
                list.remove(counter);
                list.add(counter, newTask1);
            }else{
                list.add(newTask1);
            }
        }
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





