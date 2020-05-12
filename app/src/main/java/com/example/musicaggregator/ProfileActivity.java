package com.example.musicaggregator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ProfileActivity extends AppCompatActivity {

    private Button LogOut;
    private Spinner spinner;
    private ImageView heartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        spinner = (Spinner) findViewById(R.id.spinner2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString();
                switch (selectedItem) {
                    case "Feed":
                        Intent i = new Intent(ProfileActivity.this, FeedActivity.class);
                        startActivity(i);
                        break;
                    case "Wallet":
                        Intent k = new Intent(ProfileActivity.this, WalletActivity.class);
                        startActivity(k);
                        break;
                }
            } // to close the onItemSelected
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        LogOut = (Button)findViewById(R.id.button2);
        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this,
                        "You have been logged out",
                        Toast.LENGTH_LONG).show();
                Intent l = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(l);

            }
        });

        heartBtn = (ImageView) findViewById(R.id.imageView);
        heartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(ProfileActivity.this, FeedActivity.class);
                startActivity(m);
            }
        });
    }
}
