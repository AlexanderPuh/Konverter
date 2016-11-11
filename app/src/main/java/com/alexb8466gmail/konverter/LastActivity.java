package com.alexb8466gmail.konverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LastActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_last);

        final TextView countParrots = (TextView) findViewById(R.id.count_parrots);
        countParrots.setText(getResources().getString(R.string.count_parrots)
                + getIntent().getExtras().getInt(MainActivity.PARAM_PARROTS));

        /**
         *
         * это можно было ещё записать как:
         * ((TextView) findViewById(R.id.count_parrots)).setText(R.string.count_parrots + getIntent().getExtras().getInt(MainActivity.PARAM_PARROTS));
         *
         * */
    }

    public void onClickBack(View view) {
//        final Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        finish();

        /**
         *
         * разница в том, что если делать шаг назад через интенты,
         * то стек активностей будет засорять оперативную память. А finish тупо закрывает
         * эту активность и всё
         *
         */
    }
}
