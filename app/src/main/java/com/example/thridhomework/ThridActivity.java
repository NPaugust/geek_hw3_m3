package com.example.thridhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class ThridActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);
        recyclerView = findViewById(R.id.rv_character);
        loadData();
        CharacterAdapter adapter = new CharacterAdapter(character);
        recyclerView.setAdapter(adapter);
    }

    private void loadData(){
        character = new ArrayList<>();
        character.add("Spider-Man");
        character.add("Captain America");
        character.add("Dr Strange");
        character.add("Black Panther");
        character.add("Iron Man");
        character.add("Hulk");
        character.add("Thor");
        character.add("Rocket Raccoon");
        character.add("Thanos");
        character.add("Falcon");
        character.add("Venom");
        character.add("Deadpool");
        character.add("Bucky");
        character.add("Loki");
    }
}