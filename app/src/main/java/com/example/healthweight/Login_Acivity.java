package com.example.healthweight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

public class Login_Acivity extends AppCompatActivity {
    private Button login;
    private TextView register;
    private EditText username, pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acivity);
        login = (Button) findViewById(R.id.loginbtn);
        register = (TextView) findViewById(R.id.register_text);
        username = (EditText) findViewById(R.id.usernameLogin);
        pwd      = (EditText) findViewById(R.id.password_login);
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent registerACtivity = new Intent(Login_Acivity.this, Register_Activity.class);
                startActivity(registerACtivity);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}