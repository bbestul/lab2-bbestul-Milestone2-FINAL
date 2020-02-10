package com.example.lab2_bbestul_milestone2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFunction(View view){
        EditText editText = (EditText) findViewById(R.id.editText2);
        double conversionValue = Integer.parseInt(editText.getText().toString());
        conversionValue = conversionValue * 0.77;
        goToActivity2(Double.toString(conversionValue));
    }

    public void goToActivity2(String conversionValue){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", conversionValue);
        startActivity(intent);
    }
}
