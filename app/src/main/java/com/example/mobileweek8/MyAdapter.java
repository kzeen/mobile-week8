package com.example.mobileweek8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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
        View generatedView;
        if (convertView == null)
            generatedView = LayoutInflater.from(context).inflate(R.layout.list_item , parent, false);
        else
            generatedView = convertView;
        // Get the datasource index position
        String studentName = studentsName.get(position);
        // Fill this view with the data
        TextView tv_name = generatedView.findViewById(R.id.tv_studentname);
        tv_name.setText(studentName);
        // Return the finalized view
        return generatedView;
    }
}
