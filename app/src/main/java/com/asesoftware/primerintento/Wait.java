package com.asesoftware.primerintento;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Wait extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);
        Intent miIntent = new Intent(Wait.this,Launcher.class);
        startActivity(miIntent);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }


}
