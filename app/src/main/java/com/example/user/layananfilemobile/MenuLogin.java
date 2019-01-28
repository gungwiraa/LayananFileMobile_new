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

public class MenuLogin extends AppCompatActivity implements View.OnClickListener {

    private EditText login_email, login_password;
    private Button btnLogin;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_login);

        progressDialog = new ProgressDialog(this);

        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser() != null){
            //menu profil
            finish();
            startActivity(new Intent(getApplicationContext(), MenuUtama.class));
        }

        login_email = (EditText)findViewById(R.id.login_email);
        login_password = (EditText) findViewById(R.id.login_password);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);

    }

    private void loginUser(){
        String email = login_email.getText().toString().trim();
        String password = login_password.getText().toString().trim();

        //validasi
        if (TextUtils.isEmpty(email)){
            Toast.makeText(this, "Email tidak boleh kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Login User...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if(task.isSuccessful()){
                            finish();
                            startActivity(new Intent(getApplicationContext(), MenuUtama.class));
                        }

                    }
                });
    }

    @Override
    public void onClick(View view) {
        if(view == btnLogin){
            loginUser();
        }
    }
}
