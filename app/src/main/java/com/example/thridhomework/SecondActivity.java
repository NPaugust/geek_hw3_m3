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
        contacts.add("Super-Sense");
        contacts.add("Super soldier");
        contacts.add("Magic");
        contacts.add("Black Panther suit");
        contacts.add("Iron Suit");
        contacts.add("Power");
        contacts.add("Lightning");
        contacts.add("I am Groot");
        contacts.add("Infinity stones");
        contacts.add("Wings");
        contacts.add("Symbiosis");
        contacts.add("Immortality");
        contacts.add("Just a man");
        contacts.add("God of lying");
    }
}