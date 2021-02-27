package com.example.android.course_schedule_tracker;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
/*
*creating a subclass under ArrayAdapter as it only takes input of a layout containing single text view
* created by @FlameAlchemist16
 */
public class CourseAdapter extends ArrayAdapter<courses> {
    /*
    * our custom constructor
    * parameters are context and course(variable names)
    * @param context is used for taking input of the activity of current context and used to inflate the layout file.
    * @param course take input of the array list of all the courses provided under a branch.
     */
    public CourseAdapter(Activity context, ArrayList<courses> course){
        /*
        * Because this is a custom adapter for two TextViews the adapter is not going to use
        * this second argument, so it can be any value. Here, I used 0.
         */
        super(context,0,course);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View recycleView = convertView;
        if(recycleView == null){
            recycleView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_specs, parent, false);
        }
        courses courseItem = getItem(position);
        TextView itemText = (TextView) recycleView.findViewById(R.id.t1);
        itemText.setText(courseItem.getCourseCode());
        TextView itemText1= (TextView) recycleView.findViewById(R.id.t2);
        itemText1.setText(courseItem.getCourseName());

        return recycleView;
    }
}
