package com.example.varun.project;



import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class add_bill_activity extends AppCompatActivity implements DatePickerFragment.update {

    EditText month;
    EditText date;
    EditText year;
    EditText amount;
    Button add_button;
    Button scan_button;
    String mm;
    String dd;
    String yy;
    String amn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bill_activity);
        month=(EditText)findViewById(R.id.month);
        date=(EditText)findViewById(R.id.date);
        year=(EditText)findViewById(R.id.year);
        amount=(EditText)findViewById(R.id.amount);
        add_button=(Button)findViewById(R.id.add_button);
        scan_button=(Button)findViewById(R.id.scan_button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mm=month.getText().toString();
                dd=date.getText().toString();
                yy=year.getText().toString();
                amn=amount.getText().toString();
String toShow="You bought for $ "+amn+" on "+mm+"/"+dd+"/"+yy;
                Toast.makeText(getApplicationContext(),toShow,Toast.LENGTH_SHORT).show();
            }
        });

        scan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),scan_bill_activity.class);
                startActivity(intent);
            }
        });
    }
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(),"datePicker");
    }
    public void updated(ArrayList<String> list){
String mon=list.get(0);
        String day=list.get(1);
        String yr=list.get(2);
        month.setText(mon);
        date.setText(day);
        year.setText(yr);
    }
}
