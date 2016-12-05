package com.example.jcastillo.laboratorio5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NuevoContacto extends AppCompatActivity {

    private EditText nameEditText;
    private EditText dniEditText;
    private EditText emailEditText;
    private EditText celularEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_contacto);
    }

    public void volverbtn(View view){
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }



}
