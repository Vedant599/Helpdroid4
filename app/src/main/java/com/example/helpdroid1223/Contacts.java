package com.example.helpdroid1223;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Contacts extends AppCompatActivity {
private Button Add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Add=findViewById(R.id.Addbtn);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Contacts.this, "Data Added" +
                        "", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
