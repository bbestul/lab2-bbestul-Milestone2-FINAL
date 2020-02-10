package com.example.lab2_bbestul_milestone2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        String conversionValue = intent.getStringExtra("message");
//        Log.i("Info", conversionValue);

        textView.setText((conversionValue));
    }
}
