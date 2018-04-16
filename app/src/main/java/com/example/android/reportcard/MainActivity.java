package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create words array list :
        final ArrayList<Report> reports = new ArrayList<>();
        reports.add(new Report("Sarah", 10 , 'A'));
        reports.add(new Report("Mohamed", 9 , 'B'));
        reports.add(new Report("Salma", 8 , 'A'));
        reports.add(new Report("Maryam", 8 , 'C'));
        reports.add(new Report("Hamza", 9 , 'B'));
        reports.add(new Report("Malak", 9 , 'A'));
        reports.add(new Report("Abdallah", 10 , 'B'));
        reports.add(new Report("Alyaa", 9, 'C'));
        reports.add(new Report("Ahmed", 6 , 'B'));
        reports.add(new Report("Samaa", 7 ,'D'));
        //set Custom Adapter
        ReportAdapter adapter = new ReportAdapter(this, reports);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Report report = reports.get(position);
            }

        });
    }
}