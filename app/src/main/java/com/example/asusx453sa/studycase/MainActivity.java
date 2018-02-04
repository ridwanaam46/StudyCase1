package com.example.asusx453sa.studycase;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";
    private EditText menuEditText;
    private EditText porsiEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuEditText = findViewById(R.id.menu);
        porsiEditText = findViewById(R.id.porsi);




    }

    public void klikabnormal(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String menu = menuEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, menu);
        startActivity(intent);

        String porsi = porsiEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, porsi);
        startActivity(intent);






        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, R.string.toast_abnormal, Toast.LENGTH_LONG);
        toast.show();
    }

    public void klikeatbos(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);

        String menu = menuEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, menu);
        startActivity(intent);


        String porsi = porsiEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, porsi);
        startActivity(intent);


        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, R.string.toast_eatbos, Toast.LENGTH_LONG);
        toast.show();
    }
}

