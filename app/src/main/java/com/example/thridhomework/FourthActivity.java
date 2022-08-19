package com.example.thridhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class FourthActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        recyclerView = findViewById(R.id.rv_address);
        loadData();
        AddressAdapter adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);

    }

    private void loadData(){
        address = new ArrayList<>();
        address.add("Green Goblin");
        address.add("Red Skull");
        address.add("Dormammu");
        address.add("Killmonger");
        address.add("Thanos");
        address.add("Abomination");
        address.add("Helda");
        address.add("Drax");
        address.add("Everyone");
        address.add("Thanos");
        address.add("Spider-Man");
        address.add("Ryan Reynolds");
        address.add("Thanos");
    }
}