package com.example.android.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ReportAdapter extends ArrayAdapter<Report> {
    public ReportAdapter(Activity context, ArrayList<Report> reports) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, reports);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }

        Report currentReport = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentReport.getname());

        // Find the TextView in the list_item.xml layout with the Math Grade.
        TextView mathGradeTextView = (TextView) listItemView.findViewById(R.id.math_grade);
        mathGradeTextView.setText(currentReport.getmathGrade());

        // Find the TextView in the list_item.xml layout with the Arabic Grade.
        TextView arabicGradeTextView = (TextView) listItemView.findViewById(R.id.arabic_grade);
        arabicGradeTextView.setText(currentReport.getarabicGrade());

        return listItemView;
    }
}
