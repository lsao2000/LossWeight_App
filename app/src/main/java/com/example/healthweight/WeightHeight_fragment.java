package com.example.healthweight;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeightHeight_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeightHeight_fragment extends Fragment {
    private Spinner height;
    private View view;
    public EditText heightValue, weighValue;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_weight_height_fragment, container, false);
        Spinner height = view.findViewById(R.id.heightItem);
        heightValue  = view.findViewById(R.id.height_value);
        weighValue   = view.findViewById(R.id.weight_value);

        return view;
    }
    public EditText getHeightValue(){
        return  heightValue;
    }
}