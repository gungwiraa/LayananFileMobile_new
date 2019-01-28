package com.example.user.layananfilemobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MenuUtama extends AppCompatActivity implements View.OnClickListener{

    private FirebaseAuth firebaseAuth;
    private TextView userEmail;
    private Button btnLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser() == null){
            finish();
            startActivity(new Intent(this, MenuLogin.class));
        }

        FirebaseUser user = firebaseAuth.getCurrentUser();
        userEmail.setText("Selamat Datang " +user.getEmail());

        userEmail = (TextView)findViewById(R.id.userEmail);
        btnLogout = (Button)findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(this);
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
