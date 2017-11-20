package com.example.masrizal.iak2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class arda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arda);
    }
    public void kehome4(View view) {
        Intent intent = new Intent(arda.this, home.class);
        startActivity(intent);
    }
    public void webview_arda(View view) {
        Intent intent = new Intent(arda.this, webviewArda.class);
        startActivity(intent);
    }
}
