package com.example.tarotcards;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ActivityTarot extends AppCompatActivity {

    public static int getRandomIntegerBetweenRange(int min, int max) {
        int x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    public static int getRandomID(List bl, int min, int max) {
        int y;
        do {
            y = getRandomIntegerBetweenRange(min, max);
        } while (bl.contains(y) != false);
        return y;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarot);
        TextView textView = (TextView) findViewById(R.id.textViewTarot);
        Button Get_prediction = (Button) findViewById(R.id.Get_prediction);
        Button button_back2 = (Button) findViewById(R.id.button_back2);
        Bundle arguments = getIntent().getExtras();
        int min = arguments.getInt("min");
        int max = arguments.getInt("max");
        String[] tarotCardName = new String[]{getString(R.string.work1), getString(R.string.work2), getString(R.string.work3), getString(R.string.work4), getString(R.string.work5), getString(R.string.work6), getString(R.string.relationship1), getString(R.string.relationship2), getString(R.string.relationship3), getString(R.string.relationship4), getString(R.string.family1), getString(R.string.family2), getString(R.string.family3), getString(R.string.family4), getString(R.string.family5), getString(R.string.inner_world1), getString(R.string.inner_world2), getString(R.string.inner_world3), getString(R.string.inner_world4), getString(R.string.inner_world5), getString(R.string.inner_world6), getString(R.string.inner_world7)};
        Integer[] res = new Integer[0];
        List Res = new ArrayList<>(Arrays.asList(res));
        button_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
        Get_prediction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = min; i < max; i++) {
                    int z = getRandomID(Res, min, max);
                    Res.add(z);
                }
                textView.setText("Ваши карты: " +(String) tarotCardName[(int)Res.get(0)] + " и " + (String) tarotCardName[(int)Res.get(1)]);
                Integer[] res = new Integer[0];
                List Res = new ArrayList<>(Arrays.asList(res));
            }
        });
        Button button_tarot_cards = (Button) findViewById(R.id.button_tarot_cards);
        button_tarot_cards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTarot.this, CardsTarotActivity.class);
                startActivity(intent);
            }
        });
    }
}