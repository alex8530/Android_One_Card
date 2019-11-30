package com.example.androidonedeal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Login_RegisterActivity extends AppCompatActivity {
    /////////this is for login
    TextView sigup_text,txt_login, forgot_pass;
    EditText input_email, input_password;
    AppCompatButton but_login;
    Button fb_login, tw_login, gp_login;
    TextView txt_have_account,terms_text;
    LinearLayout linear_login ,linear_sigup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__register);

        ///////this is for login
        linear_login=findViewById(R.id.linear_login);
        linear_sigup=findViewById(R.id.linear_sigup);
        sigup_text=findViewById(R.id.sigup_text);
        txt_login=findViewById(R.id.txt_login);


        sigup_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear_login.setVisibility(View.GONE);
                linear_sigup.setVisibility(View.VISIBLE);
                sigup_text.setTextColor(getResources().getColor(R.color.white));
                txt_login.setTextColor(getResources().getColor(R.color.txt_color));
            }
        });
        txt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear_login.setVisibility(View.VISIBLE);
                linear_sigup.setVisibility(View.GONE);
                txt_login.setTextColor(getResources().getColor(R.color.white));
                sigup_text.setTextColor(getResources().getColor(R.color.txt_color));
            }
        });

        //////////////this is for signup
        txt_have_account=findViewById(R.id.txt_have_account);
        txt_have_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear_login.setVisibility(View.VISIBLE);
                linear_sigup.setVisibility(View.GONE);
                txt_login.setTextColor(getResources().getColor(R.color.white));
                sigup_text.setTextColor(getResources().getColor(R.color.txt_color));
            }

        });


        AppCompatButton but_sigup= findViewById(R.id.but_sigup);
        but_sigup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });


        AppCompatButton but_login= findViewById(R.id.but_login);
        but_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }




}
