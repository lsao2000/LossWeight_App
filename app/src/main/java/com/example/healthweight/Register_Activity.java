package com.example.healthweight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
public class Register_Activity extends AppCompatActivity {
    private TextView login;
    private String fulnUser, emailUser, passUser;
    private boolean validfullName, validEmail, validPassword;
    private EditText fullName, email, password;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);
        login    = (TextView) findViewById(R.id.login_text);
        fullName = (EditText) findViewById(R.id.fullname);
        email    = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password_register);
        register = (Button) findViewById(R.id.registerbtn);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent loginActivity = new Intent(Register_Activity.this, Login_Acivity.class);
                startActivity(loginActivity);
            }
        });
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                fulnUser  = fullName.getText().toString();
                emailUser = email.getText().toString();
                passUser  = password.getText().toString();
                if(fulnUser.isEmpty()){
                    fullName.setError("Please fill out this box. ");
                    validfullName = false;
                }else{
                    if (fulnUser.length() < 4){
                        fullName.setError("The full must be at least 4 carracter. ");
                        validfullName = false;
                    }else{
                        validfullName = true;
                    }
                }
                if(emailUser.isEmpty()){
                    email.setError("Please fill out this box. ");
                    validEmail = false;
                }else{
                    if(emailUser.length() < 5){
                        email.setError("This must type of email. ");
                        validEmail = false;
                    }else {
                        validEmail = true;
                    }
                }
                if(validEmail && validfullName ){
                    Intent CompleteRegister = new Intent(Register_Activity.this, Complete_Register.class);
                    CompleteRegister.putExtra("fullname", fulnUser);
                    CompleteRegister.putExtra("email", emailUser);
                    CompleteRegister.putExtra("password", passUser);
                    startActivity(CompleteRegister);
                }
            }
        });
    }
}