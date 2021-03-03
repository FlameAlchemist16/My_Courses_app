package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ChemBranch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem_branch);

        ArrayList<courses> course = new ArrayList<courses>();

//        CHE211a-Fluid Mechanics And Its Application
        course.add(new courses("CHE211a","Fluid Mechanics and Its Application"));
//        CHE221a-Chemical Engineering Thermodynamics
        course.add(new courses("CHE221a","Chemical Engineering Thermodynamics"));
//        CHE251a-Introduction To Che And Process Calculation
        course.add(new courses("CHE251a","Introduction To Che And Process Calculation"));
//        CHE261a-Chemical Process Industries
        course.add(new courses("CHE261a","Chemical Process Industries"));
//        CHE300a-Chemical Engineering Communication Skills
        course.add(new courses("CHE300a","Chemical Engineering Communication Skills"));
//        CHE312a-Heat Transfer & Its Applications
        course.add(new courses("CHE312a","Heat Transfer and Its Applications"));
//        CHE313a-Mass Transfer & Its Applications
        course.add(new courses("CHE313a","Mass Transfer and Its Applications"));
//        CHE331a-Chemical Reaction Engineering
        course.add(new courses("CHE331a","Chemical Reaction Engineering"));
//        CHE349a-UG PROJECT (UGP-I)
        course.add(new courses("CHE349a","UG PROJECT (UGP-I)"));
//        CHE352a-Chemical Process Simulation Lab
        course.add(new courses("CHE352a","Chemical Process Simulation Lab"));
//        CHE362a- Biochemical Engineering
        course.add(new courses("CHE362a","Biochemical Engineering"));
//        CHE381a-Process Control
        course.add(new courses("CHE381a","Process Control"));
//        CHE391a-Unit Operation Laboratory -I
        course.add(new courses("CHE391a","Unit Operation Laboratory -I"));
//        CHE398a-UG Project II
        course.add(new courses("CHE398a","UG Project II"));
//        CHE399a-Chemical Engineering Communication Skills
        course.add(new courses("CHE399a","Chemical Engineering Communication Skills"));
//        CHE453a-Chemical Engineering Design
        course.add(new courses("CHE453a","Chemical Engineering Design"));
//        CHE463a-Electronic Polymeric & Ceramic Materials & Processing
        course.add(new courses("CHE463a","Electronic Polymeric and Ceramic Materials and Processing"));
//        CHE492a-Unit Operations And Process Control Laboratory
        course.add(new courses("CHE492a","Unit Operations and Process Control Laboratory"));
//        CHE494a-Summer In-Plant Training
        course.add(new courses("CHE494a","Summer In-Plant Training"));
//        CHE497a-Under Graduate Project-II
        course.add(new courses("CHE497a","Under Graduate Project-II"));

        CourseAdapter itemsAdapter = new CourseAdapter(this,course);
        ListView listView = (ListView) findViewById(R.id.chemList);
        listView.setAdapter(itemsAdapter);
    }
}