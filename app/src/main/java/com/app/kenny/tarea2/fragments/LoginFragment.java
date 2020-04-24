package com.app.kenny.tarea2.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.app.kenny.tarea2.R;
import com.google.android.material.textfield.TextInputEditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

public class LoginFragment extends Fragment {

    private TextInputEditText et_peso;
    private Button btn_calc_peso;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn_calc_peso = view.findViewById(R.id.btn_calc_peso);
        et_peso = view.findViewById(R.id.et_peso);
        btn_calc_peso.setEnabled(false);
        btn_calc_peso.setOnClickListener(v -> {
            NavDirections action = LoginFragmentDirections.actionLoginFragmentToPesoFragment(et_peso.getText().toString());
            NavHostFragment.findNavController(LoginFragment.this).navigate(action);
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
