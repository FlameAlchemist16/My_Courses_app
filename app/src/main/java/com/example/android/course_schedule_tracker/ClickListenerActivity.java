package com.example.android.course_schedule_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ClickListenerActivity implements View.OnClickListener {

    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),"Opening course details", Toast.LENGTH_SHORT).show();
    }
}