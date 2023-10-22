package com.example.healthweight;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;


public class GenderUsername_fragment extends Fragment {
    View view;
    private LinearLayout maleGender, femaleGender;
    private static EditText username;
    private static String genderText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_gender_username_fragment, container, false);
        maleGender   = view.findViewById(R.id.male_Gender);
        femaleGender = view.findViewById(R.id.female_gender);
        username     = view.findViewById(R.id.usernameRegister);
        genderText = "male";
        // Inflate the layout for this fragment
        femaleGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genderText = "female";
                femaleGender.setBackgroundResource(R.drawable.gender_button);
                maleGender.setBackgroundResource(R.drawable.desactive_gender_button);
            }
        });
        maleGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genderText = "male";
                maleGender.setBackgroundResource(R.drawable.gender_button);
                femaleGender.setBackgroundResource(R.drawable.desactive_gender_button);
            }
        });

        return view;
    }
    public static String getGenderText(){
        return genderText;
    }
    public static String getUsernameText(){
        String usernameText = username.getText().toString();
        return usernameText;
    }
}