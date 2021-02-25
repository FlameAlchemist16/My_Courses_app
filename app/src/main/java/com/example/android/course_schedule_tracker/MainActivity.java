package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        creating onClickListener
        TextView course1 =(TextView)findViewById(R.id.c1);
        TextView course2 =(TextView)findViewById(R.id.c2);
        TextView course3 =(TextView)findViewById(R.id.c3);
        TextView course4 =(TextView)findViewById(R.id.c4);
        TextView course5 =(TextView)findViewById(R.id.c5);
        course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                make intent to open new activity when a button or textView is clicked
                Toast.makeText(v.getContext(),"Opening Branch details", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, CseBranch.class);
                startActivity(intent);
                
            }
        });
//        course2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                make intent to open new activity when a button or textView is clicked
//                Toast.makeText(v.getContext(),"Opening Branch details", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, ElectricalBranch.class);
//                startActivity(intent);
//
//            }
//        });
        course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                make intent to open new activity when a button or textView is clicked
                Toast.makeText(v.getContext(),"Opening Branch details", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, CivilBranch.class);
                startActivity(intent);

            }
        });
//        course4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                make intent to open new activity when a button or textView is clicked
//                Toast.makeText(v.getContext(),"Opening Branch details", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, AerospaceBranch.class);
//                startActivity(intent);
//
//            }
//        });
//        course5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                make intent to open new activity when a button or textView is clicked
//                Toast.makeText(v.getContext(),"Opening Branch details", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, ChemicalBranch.class);
//                startActivity(intent);
//
//            }
//        });
    }

}