package com.example.varun.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by varun on 10/16/2016.
 */

public class see_bills_adapter extends ArrayAdapter<String[]> {
    public see_bills_adapter(Context context, ArrayList<String[]> resource) {
        super(context, R.layout.see_bill_adapter, resource);
    }
TextView merchant,bill,date;
    int index;

    @Override
    public View getView(final int index, View row, ViewGroup parent) {
System.out.println("hi");
        LayoutInflater minflater = LayoutInflater.from(getContext());
        row = minflater.inflate(R.layout.see_bill_adapter, parent, false);

        merchant=(TextView)row.findViewById(R.id.merchant_name);
        bill=(TextView)row.findViewById(R.id.bill);
        date=(TextView)row.findViewById(R.id.date);

        System.out.println("Inside Adapter");

        String[]temp=getItem(index);
        merchant.setText(temp[0]);
        date.setText(temp[1]);
bill.setText("$"+temp[2]);
        return row;
    }
}
