package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CseBranch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_branch);

        ArrayList<courses> course = new ArrayList<courses>();

//        CS201A-Mathematics For Computer Science -I
        course.add(new courses("CS201A","Mathematics For Computer Science -I"));
//        CS202A-Mathematics For Computer Science -II
        course.add(new courses("CS201A","Mathematics For Computer Science -II"));
//        CS210A-Data Structure And Algorithms
        course.add(new courses("CS201A","Data Structure And Algorithms"));
//        CS220A-Computer Organization
        course.add(new courses("CS201A","Computer Organization"));
//        CS251A-Computing Laboratory-I
        course.add(new courses("CS251A","Computing Laboratory-I"));
//        CS252A-Computing Laboratory II
        course.add(new courses("CS252A","Computing Laboratory II"));
//        CS300A-Technical Communication
        course.add(new courses("CS300A","Technical Communication"));
//        CS315A-Principles Of Data Base Systems
        course.add(new courses("CS315A","Principles Of Data Base Systems"));
//        CS330A-Operating Systems
        course.add(new courses("CS330A","Operating Systems"));
//        CS335A-Compiler Design
        course.add(new courses("CS335A","Compiler Design"));
//        CS340A-Theory Of Computation
        course.add(new courses("CS340A","Theory Of Computation"));
//        CS345A-Algorithms -II
        course.add(new courses("CS345A","Algorithms -II"));
//        CS350A-Principles Of Programming Langauges
        course.add(new courses("CS350A","Principles Of Programming Langauges"));
//        CS360A-Introduction To Computer Graphics
        course.add(new courses("CS360A","Introduction To Computer Graphics"));
//        CS365A-Artificial Intelligence Programming
        course.add(new courses("CS365A","Artificial Intelligence Programming"));
//        CS396A-UG PROJECT (UGP-II)
        course.add(new courses("CS396A","UG PROJECT (UGP-II)"));
//        CS422A-Computer Architecture
        course.add(new courses("CS422A","Computer Architecture"));
//        CS425A-Computer Networks
        course.add(new courses("CS425A","Computer Networks"));
//        CS433A-Parallel Programming
        course.add(new courses("CS433A","Parallel Programming"));
//        CS455A-Introduction To Software Engineering
        course.add(new courses("CS455A","Introduction To Software Engineering"));
//        CS498A-Under Graduate Project-III
        course.add(new courses("CS498A","Under Graduate Project-III"));
        CourseAdapter itemsAdapter = new CourseAdapter(this, course);
        ListView listView = (ListView) findViewById(R.id.cseList);
        listView.setAdapter(itemsAdapter);
    }
}
