package com.example.jcastillo.laboratorio5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NuevaTarea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_tarea);
    }

    public void volverbtn(View view){
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}

