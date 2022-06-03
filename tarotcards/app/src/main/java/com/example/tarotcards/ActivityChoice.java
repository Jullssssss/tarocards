package com.example.tarotcards;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class ActivityChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button_back1 = (Button) findViewById(R.id.button_back1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityChoice.this, ActivityTarot.class);
                int min = 0;
                int max = 5;
                intent.putExtra("min", min);
                intent.putExtra("max", max);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityChoice.this, ActivityTarot.class);
                int min = 6;
                int max = 9;
                intent.putExtra("min", min);
                intent.putExtra("max", max);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityChoice.this, ActivityTarot.class);
                int min = 10;
                int max = 14;
                intent.putExtra("min", min);
                intent.putExtra("max", max);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityChoice.this, ActivityTarot.class);
                int min = 15;
                int max = 21;
                intent.putExtra("min", min);
                intent.putExtra("max", max);
                startActivity(intent);
            }
        });
        button_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}