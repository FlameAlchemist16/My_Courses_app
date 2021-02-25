package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CseBranch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_branch);

        ArrayList<String> courses = new ArrayList<String>();

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, courses);
        ListView listView = (ListView) findViewById(R.id.cseList);
        listView.setAdapter(itemsAdapter);
    }
}
