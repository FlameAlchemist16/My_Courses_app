package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Layer;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AeroBranch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aero_branch);
        ArrayList<courses> course = new ArrayList<courses>();

//        AE201A-Introduction To Aerospace Engineering
        course.add(new courses("AE201A","Introduction To Aerospace Engineering"));
//        AE211A-Incompressible Aerodynamics
        course.add(new courses("AE211A","Incompressible Aerodynamics"));
//        AE251A-Experiments In Aerospace Engineering-I
        course.add(new courses("AE251A","Experiments In Aerospace Engineering-I"));
//        AE311A-Compressible Aerodynamics
        course.add(new courses("AE311A","Compressible Aerodynamics"));
//        AE321A-Flight Mechanics I
        course.add(new courses("AE321A","Flight Mechanics I"));
//        AE322A-Flight Mechanics- II
        course.add(new courses("AE322A","Flight Mechanics- II"));
//        AE331A- Introduction to Aerospace Structures
        course.add(new courses("AE331A","Introduction to Aerospace Structures"));
//        AE341A-Aerospace Propulsion
        course.add(new courses("AE341A","Aerospace Propulsion"));
//        AE345A-Spacecraft Guidance Navigation And Control
        course.add(new courses("AE345A","Spacecraft Guidance Navigation And Control"));
//        AE351A-Experiments In Aerospace Engineering -II
        course.add(new courses("AE351A","Experiments In Aerospace Engineering -II"));
//        AE361A-Aeromodel Design & Fabrication
        course.add(new courses("AE361A","Aeromodel Design & Fabrication"));
//        AE391A-UG Project (UGP-I)
        course.add(new courses("AE391A","UG Project (UGP-I)"));
//        AE401A-Technical Communication
        course.add(new courses("AE401A","Technical Communication"));
//        AE421A-Experiments in flight mechanics
        course.add(new courses("AE421A","Experiments in flight mechanics"));
//        AE441A-Turbo-Machinery
        course.add(new courses("AE441A","Turbo-Machinery"));
//        AE451A-Experiments in Aerospace Engineering
        course.add(new courses("AE451A","Experiments in Aerospace Engineering"));
//        AE461A-Aircraft Design-I
        course.add(new courses("AE461A","Aircraft Design-I"));
//        AE462A-Aircraft Design-II
        course.add(new courses("AE462A","Aircraft Design-II"));
//        AE471A-B Tech Project
        course.add(new courses("AE471A","B.Tech Project"));
//        AE481A-Boundary Layer Theory
        course.add(new courses("AE481A","Boundary Layer Theory"));

        CourseAdapter itemsAdapter = new CourseAdapter(this,course);
        ListView listView = (ListView) findViewById(R.id.aeroList);
        listView.setAdapter(itemsAdapter);
    }
}