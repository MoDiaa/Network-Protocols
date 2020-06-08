package com.example.modiaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Moslsalat extends AppCompatActivity {
    ListView lst;

    String[] moslsal = {"El Ekhtyar","Valentino","Al-Nehaya","Al-Prince"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lst = (ListView) findViewById(R.id.list1);
        ArrayAdapter<String> arrayadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, moslsal);
        lst.setAdapter(arrayadapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(Moslsalat.this, ElEkhtyar.class);
                    startActivity(intent);

                }
                if(position==1){
                    Intent intent = new Intent(Moslsalat.this, Valentino.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent(Moslsalat.this, AlNehaya.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent(Moslsalat.this, AlPrince.class);
                    startActivity(intent);
                }
            }
        });
    }
}