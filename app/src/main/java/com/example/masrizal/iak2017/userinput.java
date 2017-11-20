package com.example.masrizal.iak2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class userinput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinput);
    }
    public void kehome3(View view) {
        Intent intent = new Intent(userinput.this, home.class);
        startActivity(intent);
    }
    public void webview_input(View view) {
        Intent intent = new Intent(userinput.this, webviewInput.class);
        startActivity(intent);
    }
}
