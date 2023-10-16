package com.example.healthweight;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GenderUsername_fragment#} factory method to
 * create an instance of this fragment.
 */
public class GenderUsername_fragment extends Fragment {
    View view;
    private boolean validGender, validUsername;
    private LinearLayout maleGender, femaleGender;
    private EditText username;
    private String gender;
    private String weightText, heightText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_gender_username_fragment, container, false);
        maleGender   = view.findViewById(R.id.male_Gender);
        femaleGender = view.findViewById(R.id.female_gender);
        username     = view.findViewById(R.id.usernameRegister);
        // Inflate the layout for this fragment
        femaleGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gender = "female";
                femaleGender.setBackgroundResource(R.drawable.gender_button);
                maleGender.setBackgroundResource(R.drawable.desactive_gender_button);
            }
        });
        maleGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gender = "male";
                maleGender.setBackgroundResource(R.drawable.gender_button);
                femaleGender.setBackgroundResource(R.drawable.desactive_gender_button);
            }
        });
        return view;
    }
}