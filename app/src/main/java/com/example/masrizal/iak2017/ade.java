package com.example.masrizal.iak2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ade);
    }
    public void kehome6(View view) {
        Intent intent = new Intent(ade.this, home.class);
        startActivity(intent);
    }
    public void webview_ade(View view) {
        Intent intent = new Intent(ade.this, webviewAde.class);
        startActivity(intent);
    }
}
