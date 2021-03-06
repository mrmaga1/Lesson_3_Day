package com.example.lesson_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button bt;
    ImageView im;
    TextView tx,buy;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.button2);
        im = findViewById(R.id.imageView);
        tx = findViewById(R.id.textView);
        buy = findViewById(R.id.buy);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                buy.setText(Integer.toString(score));
            }
        });
        
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ShopActivity.class);
                startActivity(intent);
            }

        });
    }
}