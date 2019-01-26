package com.example.user.layananfilemobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MenuRegister extends AppCompatActivity implements View.OnClickListener{

    private EditText register_email, register_password;
    private Button btnRegister;
    private ProgressDialog progressDialog;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_register);

        firebaseAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);

        register_email = (EditText)findViewById(R.id.register_email);
        register_password = (EditText)findViewById(R.id.register_password);
        btnRegister = (Button)findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(this);
    }

    private void registerUser(){
        String email = register_email.getText().toString().trim();
        String password = register_password.getText().toString().trim();

        //validasi
        if (TextUtils.isEmpty(email)){
            Toast.makeText(this, "Email tidak boleh kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Mendaftarkan User...");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            finish();
                            progressDialog.dismiss();
                            startActivity(new Intent(getApplicationContext(), MenuUtama.class));
                        }else{
                            Toast.makeText(MenuRegister.this, "Register Gagal", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }


    @Override
    public void onClick(View view) {
        if(view == btnRegister){
            registerUser();
        }
    }
}
