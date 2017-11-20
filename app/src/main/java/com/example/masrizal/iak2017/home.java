package com.example.masrizal.iak2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void aik(View view) {
        Intent intent = new Intent(home.this, aik2017.class);
        startActivity(intent);
    }
    public void face(View view) {
        Intent intent = new Intent(home.this, userinterface.class);
        startActivity(intent);
    }
    public void input(View view) {
        Intent intent = new Intent(home.this, userinput.class);
        startActivity(intent);
    }
    public void ardasurya(View view) {
        Intent intent = new Intent(home.this, arda.class);
        startActivity(intent);
    }
    public void masrizaleka(View view) {
        Intent intent = new Intent(home.this, masrizal.class);
        startActivity(intent);
    }
    public void adesetya(View view) {
        Intent intent = new Intent(home.this, ade.class);
        startActivity(intent);
    }
}
