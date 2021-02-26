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

        ArrayList<String> courses = new ArrayList<String>();

//        CS201A-Mathematics For Computer Science -I
        courses.add("CS201A");
//        CS202A-Mathematics For Computer Science -II
        courses.add("CS201A");
//        CS210A-Data Structure And Algorithms
        courses.add("CS201A");
//        CS220A-Computer Organization
        courses.add("CS201A");
//        CS251A-Computing Laboratory-I
        courses.add("CS251A");
//        CS252A-Computing Laboratory II
        courses.add("CS252A");
//        CS300A-Technical Communication
        courses.add("CS300A");
//        CS315A-Principles Of Data Base Systems
        courses.add("CS315A");
//        CS330A-Operating Systems
        courses.add("CS330A");
//        CS335A-Compiler Design
        courses.add("CS335A");
//        CS340A-Theory Of Computation
        courses.add("CS340A");
//        CS345A-Algorithms -II
        courses.add("CS345A");
//        CS350A-Principles Of Programming Langauges
        courses.add("CS350A");
//        CS360A-Introduction To Computer Graphics
        courses.add("CS360A");
//        CS365A-Artificial Intelligence Programming
        courses.add("CS365A");
//        CS396A-UG PROJECT (UGP-II)
        courses.add("CS396A");
//        CS422A-Computer Architecture
        courses.add("CS422A");
//        CS425A-Computer Networks
        courses.add("CS425A");
//        CS433A-Parallel Programming
        courses.add("CS433A");
//        CS455A-Introduction To Software Engineering
        courses.add("CS455A");
//        CS498A-Under Graduate Project-III
        courses.add("CS498A");
//        CS601A-Mathematics For Computer Science
        courses.add("CS601A");
//        CS602A-Design And Analysis Of Algorithms
        courses.add("CS602A");
//        CS618A-Indexing And Searching Techniques In Database
        courses.add("CS618A");
//        CS625A-Advanced Computer Networks
        courses.add("CS625A");
//        CS628A-Computer Systems Security
        courses.add("CS628A");
//        CS632A-Topics In Distributed Systems
        courses.add("CS632A");
//        CS634A-Mobile Computing
        courses.add("CS634A");
//        CS640A-Computational Complexity
        courses.add("CS640A");
//        CS641A-Modern Cryptology
        courses.add("CS641A");
//        CS644A-Finite Automata On Infinite Inputs
        courses.add("CS644A");
//        CS646A-Parallel Algorithms
        courses.add("CS646A");
//        CS647A-Advanced Topics In Algorithms & Data Strcutures
        courses.add("CS647A");
//        CS648A-Randomized Algorithms
        courses.add("CS648A");
//        CS653A-Bioelectricity And Bio-Electronic Devices
        courses.add("CS653A");
//        CS654A-Software Architecture
        courses.add("CS654A");
//        CS663A-Computational Geometry
        courses.add("CS663A");
//        CS671A-Introduction To Natural Language Processing
        courses.add("CS671A");
//        CS676A-Computer Vision And Image Processing
        courses.add("CS676A");
//        CS679A-Machine Learning For Computer Vision
        courses.add("CS679A");
//        CS680A-Category Theory
        courses.add("CS680A");
//        CS681A-Computational Number Theory And Algebra
        courses.add("CS681A");
//        CS682A-Quantum Computing
        courses.add("CS682A");
//        CS683A-Computational Arithmetic-Geometry & Applications
        courses.add("CS683A");
//        CS687A-Algorithmic Information Theory
        courses.add("CS687A");
//        CS697A-Special Topics In Computer Science
        courses.add("CS697A");
//        CS698A-Special Topics In : Game Theory And Its Applications In Computer Science
        courses.add("CS698A");
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, courses);
        ListView listView = (ListView) findViewById(R.id.cseList);
        listView.setAdapter(itemsAdapter);
    }
}
