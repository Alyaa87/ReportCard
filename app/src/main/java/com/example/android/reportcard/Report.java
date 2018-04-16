package com.example.android.reportcard;

public class Report {

    //define states of the class
    private String mName;
    private int mMathGrade;
    private char mArabicGrade;

    //create the constructor
    public Report(String name, int mathGrade, char arabicGrade) {
        mMathGrade = mathGrade;
        mName = name;
        mArabicGrade = arabicGrade;

    }

    //define methods for the constructor
    //define method for Name.
    public String getname() {
        return mName;
    }

    //define method for the Math Grade.
    public int getmathGrade() {
        return mMathGrade;
    }

    //define method for the arabic grade.
    public char getarabicGrade() {
        return mArabicGrade;
    }
}
