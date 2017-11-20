package com.example.masrizal.iak2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class masrizal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masrizal);
    }
    public void kehome5(View view) {
        Intent intent = new Intent(masrizal.this, home.class);
        startActivity(intent);
    }
    public void webview_masrizal(View view) {
        Intent intent = new Intent(masrizal.this, webviewMasrizal.class);
        startActivity(intent);
    }
}
