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

        ArrayList<String> courses = new ArrayList<String>();
//        CE211A-Environmental Quality & Pollution
        courses.add("CE211A");
//        CE242A-Civil Engineering Materials
        courses.add("CE242A");
//        CE262A-Engineering Hydraulics
        courses.add("CE262A");
//        CE272A-Structural Analysis
        courses.add("CE272A");
//        CE321A-Engineering Geosciences
        courses.add("CE321A");
//        CE331A-Geoinformatics
        courses.add("CE331A");
//        CE332A-Survey And Geology Camp
        courses.add("CE332A");
//        CE341A-Civil Engineering Communication Skills
        courses.add("CE341A");
//        CE351A-Soil Mechanics
        courses.add("CE351A");
//        CE352A-Foundation Design
        courses.add("CE211A");
//        CE361A-Engineering Hydrology
        courses.add("CE361A");
//        CE371A-Design Of Steel Structures
        courses.add("CE371A");
//        CE372A-Reinforced Cement Concrete Design
        courses.add("CE372A");
//        CE382A-Transportation Engineering
        courses.add("CE382A");
//        CE399A-Technical Communication
        courses.add("CE399A");
//        CE412A-Water Supply And Wastewater Disposal Systems
        courses.add("CE412A");
//        CE441A-Construction Management
        courses.add("CE441A");
//        CE451A-Application Of Geotechnical Engineering
        courses.add("CE451A");
//        CE453A-Civil Engineering Design And Constructon
        courses.add("CE453A");
//        CE454A-Concrete Engineering
        courses.add("CE454A");
//        CE462A-Hydraulic And Hydrologic Design
        courses.add("CE462A");
//        CE471A-Special Topics in Structural Design
        courses.add("CE471A");
//        CE481A-Transportation Facilities Design
        courses.add("CE481A");
//        CE491A-Under Graduate Research -I
        courses.add("CE491A");
//        CE492A-Under Graduate Research -II
        courses.add("CE492A");
//        CE601A-Statistical Analysis For Civil Engineers
        courses.add("CE601A");
//        CE602A-Advanced Mathematics For Civil Engineers
        courses.add("CE602A");
//        CE610A-Advanced Hydrology
        courses.add("CE610A");
//        CE611A-Engineering Hydraulics
        courses.add("CE611A");
//        CE613A-Computer Methods in Hydraulics and Hydrology
        courses.add("CE631A");
//        CE616A-Sediment Transportation
        courses.add("CE616A");
//        CE620A-Structural Dynamics
        courses.add("CE620A");
//        CE621A-Engineering Mechanics
        courses.add("CE621A");
//        CE622A-Stability of Structures
        courses.add("CE622A");
//        CE623A-Experimental Methods in Structurl Engineering
        courses.add("CE623A");
//        CE629A-Earthquake Analysis and Design of Structures
        courses.add("CE629A");
//        CE631A-Advanced Geotechnical Engineering
        courses.add("CE631A");
//        CE637A-Constitutive Modeling Of Frictional Materials
        courses.add("CE637A");
//        CE642A-Geological Hazards
        courses.add("CE642A");
//        CE651A-Special Concretes
        courses.add("CE651A");
//        CE671A-Introduction To Remote Sensing
        courses.add("CE671A");
//        CE674A-Global Navigation Satellite Systems(Gnss)
        courses.add("CE674A");
//        CE676A-Laser Scanning And Photogrammetry
        courses.add("CE676A");
//        CE677A-Geospatial Data Processing
        courses.add("CE677A");
//        CE678A-Introduction To Geodesy
        courses.add("CE678A");
//        CE683A-Traffic Engineering
        courses.add("CE683A");
//        CE689A-Characterization of pavement materials and analysis of pavements
        courses.add("CE689A");
//        CE690A-Laboratory Course In Transportation Engineering
        courses.add("CE609A");
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, courses);
        ListView listView = (ListView) findViewById(R.id.civilList);
        listView.setAdapter(itemsAdapter);
    }
}