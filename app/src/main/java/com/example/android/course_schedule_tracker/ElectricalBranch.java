package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ElectricalBranch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_branch);

        ArrayList<courses> course = new ArrayList<courses>();
//        EE200A-Signals, systems & networks
        course.add(new courses("EE200A","Signals, system and networks"));
//        EE210A-Microelectronics-I
        course.add(new courses("EE210A","Microelectronics-I"));
//        EE250A-Control systems analysis
        course.add(new courses("EE250A","Control systems analysis"));
//        EE301A-Digital signal processing
        course.add(new courses("EE301A","Digital signal processing"));
//        EE311A-Microelectronics II
        course.add(new courses("EE311A","Microelectronics II"));
//        EE320A-Principles of communication
        course.add(new courses("EE320A","Principles of communication"));
//        EE321A-Communication system
        course.add(new courses("EE321A","Communication system"));
//        EE330A-Power systems
        course.add(new courses("EE330A","Power systems"));
//        EE340A-Electromagnetic theory
        course.add(new courses("EE340A","Electromagnetic theory"));
//        EE360A-Power electronics
        course.add(new courses("EE360A","Power electronics"));
//        EE370A-Digital electronics
        course.add(new courses("EE370A","Digital electronics"));
//        EE380A-Electrical Engineering Lab I
        course.add(new courses("EE380A","Electrical Engineering Lab I"));
//        EE381A-Electrical engineering laboratory -II
        course.add(new courses("EE381A","Electrical engineering laboratory -II"));
//        EE390A-Electrical engineering communication skills
        course.add(new courses("EE390A","Electrical engineering communication skills"));
//        EE392A-Under graduate project II
        course.add(new courses("EE392A","Under graduate project II"));
//        EE393A-Electrical engineering under graduate project I
        course.add(new courses("EE393A","Electrical engineering under graduate project I"));
//        EE395A-Electrical engineering under graduate project III
        course.add(new courses("EE395A","Electrical engineering under graduate project III"));
//        EE399A-Electrical Engineering Communication Skills
        course.add(new courses("E399A","Electrical Engineering Communication Skills"));
//        EE401A-Electrical engineering communication skills
        course.add(new courses("EE401A","Electrical engineering communication skills"));
//        EE442A-Antennas and propagation
        course.add(new courses("EE442A","Antennas and propagation"));
//        EE491A-Under graduate project -III
        course.add(new courses("EE491A","Under graduate project -III"));
        CourseAdapter itemsAdapter = new CourseAdapter(this, course);
        ListView listView = (ListView) findViewById(R.id.electricalList);
        listView.setAdapter(itemsAdapter);
    }
}