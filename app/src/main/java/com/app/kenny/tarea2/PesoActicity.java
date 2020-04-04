package com.app.kenny.tarea2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PesoActicity extends AppCompatActivity {

    private TextView result_weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peso_activity);
        result_weight = findViewById(R.id.tv_result);
        result_weight.setText(getString(R.string.result_peso,calcMoonWeight(getIntent().getStringExtra("WEIGHT"))));
    }

    private double calcMoonWeight(String weight){
        double result = Double.parseDouble(weight)  * (16.5 / 100);
        return result;
    }
}
