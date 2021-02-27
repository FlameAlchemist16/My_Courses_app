package com.example.android.course_schedule_tracker;

public class courses {
//    first variable
    private String mCourseCode;
//    second variable
    private String mCourseName;

    public courses(String s1, String s2){
        mCourseCode =s1;
        mCourseName=s2;
    }

    public String getCourseCode(){
        return mCourseCode;
    }
    public String getCourseName(){
        return mCourseName;
    }
}
