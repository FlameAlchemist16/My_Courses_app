package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClickListenerActivity clickListenerActivity = new ClickListenerActivity();
        TextView course1 =(TextView)findViewById(R.id.c1);
        course1.setOnClickListener(clickListenerActivity);
    }

}