package com.example.helpdroid1223;

import androidx.appcompat.app.AppCompatActivity;




import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;





public class AppHomePage extends AppCompatActivity {

    private Button btn_Login;

    private Button btn_Register;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_app_home_page);

        getUi();

        btn_Login.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent intent = new Intent(AppHomePage.this, Login.class);

                startActivity(intent);

            }

        });

        btn_Register.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent intent = new Intent(AppHomePage.this,Register.class);

                startActivity(intent);

            }

        });

    }

    private void getUi(){

        btn_Login = findViewById(R.id.btn_login);

        btn_Register = findViewById(R.id.btn_register);

    }

}
