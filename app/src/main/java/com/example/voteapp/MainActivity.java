package com.example.voteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textpepsi;
    TextView textcoke;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.bvote1);
        b2 = (Button) findViewById(R.id.bvote2);
        textcoke = (TextView) findViewById(R.id.textone);
        textpepsi = (TextView) findViewById(R.id.texttwo);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String coke = textcoke.getText().toString().trim();
                int count = Integer.parseInt(coke);
                count++;
                textcoke.setText(String.valueOf(count));

            }
        });

       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String pepsi = textpepsi.getText().toString().trim();
               int count1 = Integer.parseInt(pepsi);
               count1++;
               textpepsi.setText(String.valueOf(count1));
           }
       });

        }
    }
