package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CivilBranch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_branch);

        ArrayList<courses> course = new ArrayList<courses>();
//        CE211A-Environmental Quality & Pollution
        course.add(new courses("CE211A","Environmental Quality and Pollution"));
//        CE242A-Civil Engineering Materials
        course.add(new courses("CE242A","Civil Engineering Materials"));
//        CE262A-Engineering Hydraulics
        course.add(new courses("CE262A","Engineering Hydraulics"));
//        CE272A-Structural Analysis
        course.add(new courses("CE272A","Structural Analysis"));
//        CE321A-Engineering Geosciences
        course.add(new courses("CE321A","Engineering Geosciences"));
//        CE331A-Geoinformatics
        course.add(new courses("CE331A","Geoinformatics"));
//        CE332A-Survey And Geology Camp
        course.add(new courses("CE332A","Survey And Geology Camp"));
//        CE341A-Civil Engineering Communication Skills
        course.add(new courses("CE341A","Civil Engineering Communication Skills"));
//        CE351A-Soil Mechanics
        course.add(new courses("CE351A","Soil Mechanics"));
//        CE352A-Foundation Design
        course.add(new courses("CE211A","Foundation Design"));
//        CE361A-Engineering Hydrology
        course.add(new courses("CE361A","Engineering Hydrology"));
//        CE371A-Design Of Steel Structures
        course.add(new courses("CE371A","Design Of Steel Structures"));
//        CE372A-Reinforced Cement Concrete Design
        course.add(new courses("CE372A","Reinforced Cement Concrete Design"));
//        CE382A-Transportation Engineering
        course.add(new courses("CE382A","Transportation Engineering"));
//        CE399A-Technical Communication
        course.add(new courses("CE399A","Technical Communication"));
//        CE412A-Water Supply And Wastewater Disposal Systems
        course.add(new courses("CE412A","Water Supply And Wastewater Disposal Systems"));
//        CE441A-Construction Management
        course.add(new courses("CE441A","Construction Management"));
//        CE451A-Application Of Geotechnical Engineering
        course.add(new courses("CE451A","Application Of Geotechnical Engineering"));
//        CE453A-Civil Engineering Design And Constructon
        course.add(new courses("CE453A","Civil Engineering Design And Constructon"));
//        CE454A-Concrete Engineering
        course.add(new courses("CE454A","Concrete Engineering"));
//        CE462A-Hydraulic And Hydrologic Design
        course.add(new courses("CE462A","Hydraulic And Hydrologic Design"));
//        CE471A-Special Topics in Structural Design
        course.add(new courses("CE471A","Special Topics in Structural Design"));
//        CE481A-Transportation Facilities Design
        course.add(new courses("CE481A","Transportation Facilities Design"));
//        CE491A-Under Graduate Research -I
        course.add(new courses("CE491A","Under Graduate Research -I"));
//        CE492A-Under Graduate Research -II
        course.add(new courses("CE492A","Under Graduate Research -II"));

        CourseAdapter itemsAdapter = new CourseAdapter(this,course);
        ListView listView = (ListView) findViewById(R.id.civilList);
        listView.setAdapter(itemsAdapter);
    }
}