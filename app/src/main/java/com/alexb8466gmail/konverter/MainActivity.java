package com.alexb8466gmail.konverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static int parrots;
    private EditText edit_pparots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_pparots = (EditText) findViewById(R.id.edit_parrots);

    }

    public void OnParrotsClick(View view) {
        try {
            if ((Integer.valueOf(edit_pparots.getText().toString()) < 0) || ((Integer.valueOf(edit_pparots.getText().toString()) > 100))) {
                Toast toast = Toast.makeText(getApplicationContext(), "Значение не правильное. Выполните попытку снова.", Toast.LENGTH_LONG);
                toast.show();
            } else {
                parrots = Integer.valueOf(edit_pparots.getText().toString());
                Intent intent = new Intent(this, LastActivity.class);
                startActivity(intent);

            }
        } catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Вы ввели некорректные символы", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public int getParrots() {
        return parrots;
    }
}
