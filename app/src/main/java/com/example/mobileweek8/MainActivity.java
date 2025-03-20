package com.example.mobileweek8;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> studentsList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Populate the studentsList with names
        studentsList.add("Alice Johnson");
        studentsList.add("Michael Smith");
        studentsList.add("Sarah Williams");
        studentsList.add("James Brown");
        studentsList.add("Emily Davis");
        studentsList.add("Daniel Martinez");
        studentsList.add("Olivia Taylor");
        studentsList.add("Benjamin Anderson");
        studentsList.add("Sophia Thomas");
        studentsList.add("William Harris");

        ListView studentListView = findViewById(R.id.lv_students);
        MyAdapter myAdapter = new MyAdapter(this , studentsList);
        studentListView.setAdapter(myAdapter);
    }
}