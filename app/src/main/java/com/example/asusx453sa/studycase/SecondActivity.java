package com.example.asusx453sa.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;

import static android.app.ProgressDialog.show;
import static java.lang.Integer.parseInt;


public class SecondActivity extends AppCompatActivity {
    private TextView JM;
    private TextView JP;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        TextView JP = (TextView) findViewById(R.id.textView_JumlahPorsi);
        TextView JM = (TextView) findViewById(R.id.textView_JenisMakanan);
        JP.setText(message);


    }
}