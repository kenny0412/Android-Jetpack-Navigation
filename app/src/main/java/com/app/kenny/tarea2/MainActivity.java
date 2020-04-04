package com.app.kenny.tarea2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText et_peso;
    private Button btn_calc_peso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_calc_peso = findViewById(R.id.btn_calc_peso);
        et_peso = findViewById(R.id.et_peso);
        btn_calc_peso.setEnabled(false);
        btn_calc_peso.setOnClickListener(view -> {
            Intent newInt = new Intent(MainActivity.this,PesoActicity.class);
            newInt.putExtra("WEIGHT",et_peso.getText().toString());
            startActivity(newInt);
        });

        et_peso.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                btn_calc_peso.setEnabled(s.toString().length() != 0);
            }
        });
    }

}
