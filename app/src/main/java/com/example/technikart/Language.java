package com.example.technikart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ravi sastry on 3/21/2017.
 */
public class Language extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language);
    }
public void start(View v){
    Intent i=new Intent(this,CustomerTechni.class);
    startActivity(i);
}
}