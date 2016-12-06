package com.example.varun.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class see_bills_activity extends AppCompatActivity {

    ArrayList<String>merchant=new ArrayList<>();
    ArrayList<String>bill=new ArrayList<>();
    ArrayList<String>date=new ArrayList<>();
    ArrayList<String[]>list=new ArrayList<>();

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_bills_activity);
        Intent intent = getIntent();

        listview=(ListView)findViewById(R.id.listview);

        merchant=intent.getStringArrayListExtra("merchant");
        date=intent.getStringArrayListExtra("date");
        bill=intent.getStringArrayListExtra("bill");

        System.out.println("receiving");

        String[] m={"",""};
        String[] d={"",""};
        String[] b={"",""};

        for(int i=0;i<2;i++)
        {
            m[i]=merchant.get(i);
            d[i]=date.get(i);
            b[i]=bill.get(i);
System.out.println(m[i]+"\t"+d[i]+"\t"+b[i]);

            String[] temp={m[i],d[i],b[i]};
            list.add(temp);
        }
        populatelist(list);
        System.out.println("Calling populate");
    }

    public void populatelist(ArrayList<String[]>list)
    {
        System.out.println("Calling adapter");
        ListAdapter listadapter=new see_bills_adapter(this,list);
        listview.setAdapter(listadapter);
        System.out.println("Called adapter");
    }
}
