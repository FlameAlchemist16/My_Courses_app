package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        creating onClickListener
        TextView course1 =(TextView)findViewById(R.id.c1);
        course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                make intent to open new activity when a button or textView is clicked
                Toast.makeText(v.getContext(),"Opening course details", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, CourseDetail.class);
                startActivity(intent);
                
            }
        });
    }

}