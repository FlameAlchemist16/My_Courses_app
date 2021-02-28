package com.example.android.course_schedule_tracker;

public class courses {
//    course code
    private String mCourseCode;
//    course name
    private String mCourseName;
//    number of credits
    private int mCourseCredit;
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
