package com.example.healthweight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
public class Complete_Register extends AppCompatActivity {
    private Button next;
    private ProgressBar completing;
    public static int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_register);
        next = (Button) findViewById(R.id.nextStep);
        completing = (ProgressBar) findViewById(R.id.progressBar);
        replaceFragment(new GenderUsername_fragment());
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                completing.setProgress(58);
                replaceFragment(new WeightHeight_fragment());
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