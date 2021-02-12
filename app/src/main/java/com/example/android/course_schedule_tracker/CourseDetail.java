package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CourseDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

//        content
//        array -->
        String [] aboutCourse1 = new String[3];
        aboutCourse1[0]="ESC201";
        aboutCourse1[1]="credits => 9";
        aboutCourse1[2]="Tuesday, Thursday";

    }
}
