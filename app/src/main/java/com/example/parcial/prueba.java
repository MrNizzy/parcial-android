package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class prueba extends AppCompatActivity {

    Button fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
        fab = findViewById(R.id.button3743);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Probar", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                Intent inte = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(inte);
            }
        });
    }
}