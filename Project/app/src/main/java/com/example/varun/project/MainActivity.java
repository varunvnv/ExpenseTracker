package com.example.varun.project;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends Activity {

    Button scan_button,seebill_button,predict_button;

    ArrayList<String>merchant= new ArrayList<>();
    ArrayList<String>bill=new ArrayList<>();
    ArrayList<String>date=new ArrayList<>();

    String merchant_1="keyfood";
    String merchant_2="krauzers";
    String d1="10/16/2016";
    String d2="09/6/2016";
    String bill_1="100.0";
    String bill_2="50.0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scan_button=(Button)findViewById(R.id.add_button);
        seebill_button=(Button)findViewById(R.id.seebill_button);
        predict_button=(Button)findViewById(R.id.predict_button);

        merchant.add(merchant_1);
        merchant.add(merchant_2);

        date.add(d1);
        date.add(d2);

        bill.add(bill_1);
        bill.add(bill_2);

    }

    public void add_click(View view)
    {
        Intent intent = new Intent(this, add_bill_activity.class);
        startActivity(intent);
    }

    public void see_bill_click(View view)
    {
        Intent intent = new Intent(this, see_bills_activity.class);

        intent.putStringArrayListExtra("merchant",merchant);
        intent.putStringArrayListExtra("date",date);
        intent.putStringArrayListExtra("bill",bill);
        startActivity(intent);
        System.out.println("sending");
    }


    public void prediction_click(View view)
    {
        Intent intent = new Intent(this, see_prediction_activity.class);
        startActivity(intent);
    }
}

