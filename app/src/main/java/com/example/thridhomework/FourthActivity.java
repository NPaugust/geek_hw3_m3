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
        address.add("Чуй 108/2");
        address.add("Ч.АЙтматова 54");
        address.add("Ахунбаева 114");
        address.add("Суеркулова 20/12");
        address.add("Турусбекова 88/Чуй (1)");
        address.add("Совутская 136/ Боконбаева (2)");
        address.add("Киевская 124");
        address.add("Манас 40");
        address.add("Киевская 95/ Тоголок Молдо");
        address.add("Горького 70");
        address.add("Жибек жолу 150А");
        address.add("Vefa");
        address.add("Asia Mall");
    }
}