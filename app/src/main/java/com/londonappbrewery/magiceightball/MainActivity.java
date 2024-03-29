package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.askButton);

        final ImageView ask_image = findViewById(R.id.ask_image);
        final TextView ask_text = findViewById(R.id.ask_text);



        final int [] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("LuckyBall", "Ask Button has been pressed!");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                ask_image.setImageResource(ballArray[number]);

            }
        });


    }
}
