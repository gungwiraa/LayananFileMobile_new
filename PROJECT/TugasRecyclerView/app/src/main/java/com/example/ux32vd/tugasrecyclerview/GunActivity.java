package com.example.ux32vd.tugasrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GunActivity extends AppCompatActivity {

    private TextView tvtype, tvdeskripsi, tvcategory;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gun);

        tvtype = (TextView) findViewById(R.id.guntype);
        tvdeskripsi = (TextView) findViewById(R.id.gundeskripsi);
        tvcategory = (TextView) findViewById(R.id.guncategory);
        img = (ImageView) findViewById(R.id.gunthumbnail);

        //Mneerima data

        Intent intent = getIntent();
        String Type = intent.getExtras().getString("Type");
        String Kategori = intent.getExtras().getString("Category");
        String Deskripsi = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        // pengaturan values

        tvtype.setText(Type);
        tvcategory.setText(Kategori);
        tvdeskripsi.setText(Deskripsi);
        img.setImageResource(image);
    }
}
