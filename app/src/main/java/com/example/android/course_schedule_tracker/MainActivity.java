package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String courseNo="Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// creating new courses in the app
    public void course1(View view){
        Intent intent=new Intent(this, CourseDetail.class);
        startActivity(intent);
    }
}