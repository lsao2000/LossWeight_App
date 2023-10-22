package com.example.healthweight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Complete_Register extends AppCompatActivity {
    private Button next;
    private ProgressBar completing;
    public static int count;
    private LinearLayout maleGender, femaleGender;
    private String gender, usernameText, weightText, heightText, emailText, passwordText, fullNameText;
    private boolean validGender, validUsername, validWeight, validHeight ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_register);
        completing   = (ProgressBar) findViewById(R.id.progressBar);
        next         = (Button) findViewById(R.id.nextStep);

        // getting extra data from registerActivity using Intent.
        Intent gettingData = getIntent();
        fullNameText = gettingData.getStringExtra("fullname");
        emailText = gettingData.getStringExtra("email");
        passwordText = gettingData.getStringExtra("password");

        // set deafult fragment to the frame layout.
        replaceFragment(new GenderUsername_fragment());
        // Create instance of the persone class.
        Personne personne = new Personne(fullNameText, emailText, passwordText);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                switch(count){
                    case 1:
                        String gender = GenderUsername_fragment.getGenderText();
                        String username = GenderUsername_fragment.getUsernameText();
                        Personne.setUsername(username);
                        Personne.setGender(gender);
                        completing.setProgress(58);
                        Fragment weightFragment = new WeightHeight_fragment();
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame, weightFragment);
                        fragmentTransaction.commit();
                        Toast.makeText(getApplicationContext(), personne.toString(), Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        completing.setProgress(58);
                        Fragment completeFragement = new AddUserToDatabase_fragment();
                        replaceFragment(completeFragement);
                        Toast.makeText(getApplicationContext(), personne.toString(), Toast.LENGTH_SHORT).show();
                        break;
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