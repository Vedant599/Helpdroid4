package com.example.helpdroid1223;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Contacts extends AppCompatActivity {

    public EditText Name;
    public EditText Phone;
    public EditText Email;
    public RadioGroup Relation;
    public RadioButton rel;
    public Button Add;
    private int contact;
    FirebaseDatabase db=FirebaseDatabase.getInstance();
    DatabaseReference databaseReference =db.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Name=(EditText)findViewById(R.id.edtName);
        Email=(EditText)findViewById(R.id.edtEmail);
        Phone=(EditText)findViewById(R.id.edtPhone);
        Relation=(RadioGroup)findViewById(R.id.radioGroup);
        databaseReference =db.getReference();
        contact=1;
        Add=(Button)findViewById(R.id.Addbtn);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rid=Relation.getCheckedRadioButtonId();
                rel=(RadioButton)findViewById(rid);
                String Name1=Name.getText().toString().trim();
                String Email1=Email.getText().toString().trim();
                String Phone1=Phone.getText().toString().trim();
                String Relation1=rel.getText().toString().trim();
                DataBase dataBase =new DataBase(Name1,Email1,Phone1,Relation1);
                databaseReference.child("Contact "+contact).setValue(dataBase);
                contact++;
                Toast.makeText(Contacts.this, "Data Entered", Toast.LENGTH_SHORT).show();
                Name.setText("");
                Phone.setText("");
                Email.setText("");
            }
        });


    }
}
