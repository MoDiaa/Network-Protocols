package com.example.modiaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listView extends AppCompatActivity {
    ListView lst;

    String[] company = { "Android", "iPhone","Windows", "Blackberry", "Linux" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lst = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> arrayadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, company);
        lst.setAdapter(arrayadapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(listView.this, DeviceDetail.class);
                startActivity(intent);
            }
        });
    }
}

