package com.example.user.layananfilemobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.layananfilemobile.Helper.UserInformation;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MenuUtama extends AppCompatActivity implements View.OnClickListener{

    private DatabaseReference databaseReference;
    private FirebaseAuth firebaseAuth;
    private TextView userEmail;
    private Button btnLogout, btnSaveProfile;
    private EditText et_username, et_usernim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        firebaseAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference();

        if(firebaseAuth.getCurrentUser() == null){
            finish();
            startActivity(new Intent(this, MenuLogin.class));
        }

        FirebaseUser user = firebaseAuth.getCurrentUser();
        userEmail.setText("Selamat Datang " +user.getEmail());


        et_username = (EditText)findViewById(R.id.et_username);
        et_usernim = (EditText)findViewById(R.id.et_usernim);
        userEmail = (TextView)findViewById(R.id.userEmail);
        btnLogout = (Button)findViewById(R.id.btnLogout);
        btnSaveProfile = (Button)findViewById(R.id.btnSaveProfile);

        btnSaveProfile.setOnClickListener(this);
        btnLogout.setOnClickListener(this);
    }

    private void saveUserInformation(){

        String nama = et_username.getText().toString().trim();
        String nim = et_usernim.getText().toString().trim();

        UserInformation userInformation = new UserInformation(nama, nim);
        FirebaseUser user = firebaseAuth.getCurrentUser();
        databaseReference.child(user.getUid()).setValue(userInformation);
        Toast.makeText(this, "Informasi Berhasil Tersimpan...", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View view){
        if(view == btnLogout){
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this, MenuLogin.class));
        }
    }

}
