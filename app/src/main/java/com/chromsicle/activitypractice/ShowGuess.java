package com.chromsicle.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {
    private TextView showGuessTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        showGuessTextView = findViewById(R.id.received_text_view);

        //get the data that was sent from the other activity by using its key and then update the TextView
        String value = getIntent().getStringExtra("guess");
        showGuessTextView.setText(value);
    }
}