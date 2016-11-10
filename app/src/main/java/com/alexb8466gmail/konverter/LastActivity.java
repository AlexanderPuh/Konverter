package com.alexb8466gmail.konverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by User on 09.11.2016.
 */

public class LastActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.last_activity);
        TextView add_count = (TextView) findViewById(R.id.count);

        add_count.setText("Количество попугаев :" + getIntent().getExtras().getInt("parrots"));
    }

    public void btn_Back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
