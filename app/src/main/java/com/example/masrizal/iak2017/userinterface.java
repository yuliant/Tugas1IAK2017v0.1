package com.example.masrizal.iak2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class userinterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinterface);
    }
    public void kehome2(View view) {
        Intent intent = new Intent(userinterface.this, home.class);
        startActivity(intent);
    }
    public void webview_interface(View view) {
        Intent intent = new Intent(userinterface.this, webviewInterface.class);
        startActivity(intent);
    }
}
