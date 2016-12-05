package com.example.jcastillo.laboratorio5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("CONTACTOS");
        spec.setContent(R.id.CONTACTOS);
        spec.setIndicator("CONTACTOS");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("TAREAS");
        spec.setContent(R.id.TAREAS);
        spec.setIndicator("TAREAS");
        host.addTab(spec);
    }

    public void contactobtn(View view){
        Intent intent = new Intent(this,NuevoContacto.class);
        startActivity(intent);
    }

    public void tareabtn(View view){
        Intent intent = new Intent(this,NuevaTarea.class);
        startActivity(intent);
    }
}
