package com.example.modiaa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class listView extends AppCompatActivity {
    ListView lst;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lst = (ListView) findViewById(R.id.list1);
        String[] company = new String[]{ "Moslsalat", "Program Show"};

        ArrayAdapter<String> arrayadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1, company);
        lst.setAdapter(arrayadapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent(listView.this, Moslsalat.class);
                    startActivity(intent);

                }
                if(position==1){
                    Intent intent = new Intent(listView.this, prog.class);
                    startActivity(intent);
                }


            }
        });
    }
}

