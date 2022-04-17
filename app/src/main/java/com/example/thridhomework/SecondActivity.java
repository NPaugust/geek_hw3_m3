package com.example.thridhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = findViewById(R.id.rv_contact);
        loadData();
        ContactAdapter adapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);

    }

    private void loadData(){
        contacts = new ArrayList<>();
        contacts.add("Kumarbek");
        contacts.add("Kadyrbek");
        contacts.add("Askar");
        contacts.add("Aziza");
        contacts.add("Bektur");
        contacts.add("Temirlan");
        contacts.add("Zhyrgal");
        contacts.add("Beksultan");
        contacts.add("Nurgazy");
        contacts.add("Aleksey");
        contacts.add("Azamat");
        contacts.add("Kanatbek");
        contacts.add("Erlan");
        contacts.add("Ayana");
    }
}