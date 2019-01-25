package com.example.ux32vd.tugaspromobspinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class Home extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    EditText EtNama;
    EditText EtAlamat;
    EditText EtEmail;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        EtNama = findViewById(R.id.editText2);
        EtAlamat = findViewById(R.id.editText1);
        EtEmail = findViewById(R.id.editText3);
        btn3 = findViewById(R.id.button3);

        Spinner spinner = findViewById(R.id.spinner2);
        if (spinner !=null){
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.wilayah, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner != null){
            spinner.setAdapter(adapter);
        }

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = EtNama.getText().toString();
                String alamat = EtAlamat.getText().toString();
                String email = EtEmail.getText().toString();

                Toast.makeText(getApplicationContext(), nama + " " + alamat + " " + email, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}