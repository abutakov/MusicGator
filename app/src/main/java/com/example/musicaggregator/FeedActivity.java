package com.example.musicaggregator;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.PriorityQueue;


public class FeedActivity extends AppCompatActivity {

    private Button btnLogin;
    private Spinner spinner;
    private ImageButton btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed);

        spinner = (Spinner) findViewById(R.id.spinner2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString();
                switch (selectedItem) {
                    case "Feed":
                        break;
                    case "Music Wallet":
                        Intent k = new Intent(FeedActivity.this, WalletActivity.class);
                        startActivity(k);
                        break;
                    case "Your Profile":
                        Intent l = new Intent(FeedActivity.this, ProfileActivity.class);
                        startActivity(l);
                        break;
                    case "Log out":
                        Toast.makeText(FeedActivity.this,
                                "You have been logged out",
                                Toast.LENGTH_LONG).show();
                        Intent m = new Intent(FeedActivity.this, MainActivity.class);
                        startActivity(m);
                        break;
                }
            } // to close the onItemSelected
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        btnPlay = (ImageButton) findViewById(R.id.imageButton2);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeedActivity.this,
                        "Music is playing",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
