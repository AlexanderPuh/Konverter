package com.alexb8466gmail.konverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String PARAM_PARROTS = "parrots";
    private EditText mEditParrots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditParrots = (EditText) findViewById(R.id.et_parrots);
    }

    public void onParrotsClick(View view) {
        final int countParrots = Integer.valueOf(mEditParrots.getText().toString());
        if (countParrots < 0 || countParrots > 100) {
            Toast.makeText(this, R.string.error_value_parrots, Toast.LENGTH_LONG).show();
        } else {
            final Intent intent = new Intent(this, LastActivity.class);
            intent.putExtra(PARAM_PARROTS, countParrots);
            startActivity(intent);
        }

    }
}
