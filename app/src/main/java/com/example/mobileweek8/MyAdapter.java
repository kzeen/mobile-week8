package com.example.mobileweek8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> studentsName;

    public MyAdapter(Context context, ArrayList<String> studentsName) {
        this.context = context;
        this.studentsName = studentsName;
    }

    @Override
    public int getCount() {
        return studentsName.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Create a new view for item position "position" (param) by inflating from a layout resource
        View generatedView = LayoutInflater.from(context).inflate(R.layout.list_item , parent, false);
        // Get the datasource index position
        // Fill this view with the data
        // Return the finalized view

        return generatedView;
    }
}
