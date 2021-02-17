package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

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
//        array list -->
        ArrayList<String> aboutCourse11 = new ArrayList<>();
        aboutCourse11.add("ESC201");
        aboutCourse11.add("9 credits");
        aboutCourse11.add("Tuesday");
        int a=0;
        LinearLayout cView = (LinearLayout) findViewById(R.id.c01);
        while(a<aboutCourse11.size()){
            TextView cView1 = new TextView(this);
            cView1.setText(aboutCourse11.get(a));
            cView.addView(cView1);
            a++;
//            cView.removeView(cView1);
        }
    }
}
