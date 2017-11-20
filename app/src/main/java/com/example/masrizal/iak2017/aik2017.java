package com.example.masrizal.iak2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class aik2017 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aik2017);
    }
    public void kehome(View view) {
        Intent intent = new Intent(aik2017.this, home.class);
        startActivity(intent);
    }
    public void kehome_webview(View view) {
        Intent intent = new Intent(aik2017.this, webviewAik.class);
        startActivity(intent);
    }
}
