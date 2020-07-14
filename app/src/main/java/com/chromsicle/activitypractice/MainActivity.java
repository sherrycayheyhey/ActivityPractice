package com.chromsicle.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //variable to hold the button
    private Button showGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the Button variable to be the button from the layout
        showGuess = findViewById(R.id.button_guess);

        //make it so something happens when the button is clicked
        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if the button is clicked, go to the other activity
                //intent is what you intend to do like make a call or open a webpage, etc.
                //in this case we want to go from here (MainActivity) to the other activity (ShowGuess)
                Intent intent = new Intent(MainActivity.this, ShowGuess.class);
                //the intent has been created so now it needs to actually be started
                startActivity(intent);
            }
        });


    }

    /*@Override
    protected void onStart() {
        super.onStart();
        //log and toast message to see when this is called
        Log.d("Cycle", "onCreate: ");
        Toast.makeText(MainActivity.this, "onStart() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(MainActivity.this, "onPostResume() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "onPause() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "onStop() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "onDestroy() called", Toast.LENGTH_SHORT).show();
    }*/
}
