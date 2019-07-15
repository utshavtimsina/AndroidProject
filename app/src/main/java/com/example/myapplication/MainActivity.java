package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            final Button rollButton= findViewById(R.id.rollButton);
            final TextView resultsTextView=findViewById(R.id.resultsTextView);
            final SeekBar seekBar=findViewById(R.id.seekBar);
        resultsTextView.setText("");
            rollButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    resultsTextView.setText("");
                    int sliderValue = seekBar.getProgress();
                    resultsTextView.append(Integer.toString((sliderValue*10 )) +"%");

                }
                });


    }
}
