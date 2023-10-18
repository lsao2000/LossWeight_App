package com.example.healthweight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.EditText;
import android.widget.Spinner;

public class Complete_Register extends AppCompatActivity {
    private Button next;
    private ProgressBar completing;
    public static int count;
    private LinearLayout maleGender, femaleGender;
    private String gender, usernameText, weightText, heightText, emailText, passwordText, fullNameText;
    private boolean validGender, validUsername, validWeight, validHeight ;
    private String[] heightItem = {"Cm", "In"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_register);
        completing   = (ProgressBar) findViewById(R.id.progressBar);
        next         = (Button) findViewById(R.id.nextStep);
        Intent gettingData = getIntent();
        fullNameText = gettingData.getStringExtra("fullname");
        emailText = gettingData.getStringExtra("email");
//        heightValue  = (EditText) findViewById(R.id.height_value);
//        weighValue   = (EditText) findViewById(R.id.weight_value);
        // Set array adapter to the spinner as default value.
//        ArrayAdapter<String> heightItems = new ArrayAdapter<String>(Complete_Register.this, android.R.layout.simple_spinner_dropdown_item, heightItem);
//        height.setAdapter(heightItems);
        // The default fragment in the activity_complete_register.
        replaceFragment(new GenderUsername_fragment());
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                switch(count){
                    case 1:
//                        usernameText = username.getText().toString();
//                        if(gender.isEmpty()){
//                            validGender = false;
//                            count = 0;
//                        }else{
//                            validGender = true;
//                        }
//                        if(usernameText.isEmpty()){
//                            username.setError("Please fill out this box");
//                            validUsername = false;
//                            count = 0;
//                        }else{
//                            validUsername = true;
//                        }
//                        if(validUsername && validGender){
                        completing.setProgress(58);
                        Fragment weightFragment = new WeightHeight_fragment();
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame, weightFragment);
                        fragmentTransaction.commit();
//                            replaceFragment(new WeightHeight_fragment());
//                        }
                        break;
                    case 2:
//                        weightText = weightFragment.get.getText().toString();
//                        heightText = heightValue.getText().toString();
//                        if(weightText.isEmpty()){
//                            validWeight = false;
//                            count = 1;
//                        }else{
//                            validWeight = true;
//                        }
//                        if(heightText.isEmpty()){
//                            validHeight = false;
//                            count = 1;
//                        }else{
//                            validHeight = true;
//                        }
//                        if(validHeight && validWeight){
//                            count = 2;
//                            completing.setProgress(88);
//                            replaceFragment(new AddUserToDatabase_fragment());
//                        }
//                        break;
                }
            }
        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }

}