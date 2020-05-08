package com.example.musicaggregator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class WalletActivity extends AppCompatActivity {

    private Button btnOptOut;
    private Spinner spinner;

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
                    case "Log out":
                        Intent l = new Intent(WalletActivity.this, MainActivity.class);
                        startActivity(l);
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
    }
}
