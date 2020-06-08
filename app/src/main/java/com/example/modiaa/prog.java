package com.example.modiaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class prog extends AppCompatActivity {
    ListView lst;

    String[] program = {"Ramez Magnoun Rasmy","Beat Sakka"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lst = (ListView) findViewById(R.id.list1);
        ArrayAdapter<String> arrayadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, program);
        lst.setAdapter(arrayadapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(prog.this, Ramez.class);
                    startActivity(intent);

                }
                if(position==1){
                    Intent intent = new Intent(prog.this, Beat.class);
                    startActivity(intent);
                }
            }
        });
    }
}