package com.example.musicaggregator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class WalletActivity extends AppCompatActivity {

    private Button btnOptOut;
    private Spinner spinner;
    private ImageView btnHeart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallet);

        spinner = (Spinner) findViewById(R.id.spinner2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString();
                switch (selectedItem) {
                    case "Feed":
                        Intent i = new Intent(WalletActivity.this, FeedActivity.class);
                        startActivity(i);
                        break;
                    case "Wallet":
                        break;
                    case "Your Profile":
                        Intent l = new Intent(WalletActivity.this, ProfileActivity.class);
                        startActivity(l);
                        break;
                    case "Log out":
                        Toast.makeText(WalletActivity.this,
                                "You have been logged out",
                                Toast.LENGTH_LONG).show();
                        Intent k = new Intent(WalletActivity.this, MainActivity.class);
                        startActivity(k);
                        break;
                }
            } // to close the onItemSelected
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        btnOptOut = (Button)findViewById(R.id.button3);
        btnOptOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WalletActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnHeart = (ImageView) findViewById(R.id.imageView);
        btnHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(WalletActivity.this, FeedActivity.class);
                startActivity(m);
            }
        });
    }
}
