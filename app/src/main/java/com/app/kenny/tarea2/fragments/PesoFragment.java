package com.app.kenny.tarea2.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.kenny.tarea2.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PesoFragment extends Fragment {

    private TextView result_weight;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_peso,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        result_weight = view.findViewById(R.id.tv_result);
        String peso = PesoFragmentArgs.fromBundle(getArguments()).getUserWeight();
        result_weight.setText(getString(R.string.result_peso,calcMoonWeight(peso)));

    }

    private double calcMoonWeight(String weight){
        double result = Double.parseDouble(weight)  * (16.5 / 100);
        return result;
    }
}
