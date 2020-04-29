package com.example.mapsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cekLokasiSaya(View view) {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }

    public void pantaiKonang(View view) {
        Intent intent = new Intent(MainActivity.this, MapsActivityPantaiKonang.class);
        startActivity(intent);
    }

    public void pantaiPelang(View view) {
        Intent intent = new Intent(MainActivity.this, MapsActivityPantaiPelang.class);
        startActivity(intent);
    }

    public void konservasiPenyu(View view) {
        Intent intent = new Intent(MainActivity.this, MapsActivityKonservasiPenyu.class);
        startActivity(intent);
    }


}
