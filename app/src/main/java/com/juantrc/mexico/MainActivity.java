package com.juantrc.mexico;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void presionar(View v) {
        // Toast primero toma la referencia del activity o sea, en el evento onClick se coloco un metodo,
        // después el texto a mostrar el metodo .show hace que se muestre en pantalla el mensaje
        Toast.makeText(this, "Se presionó el botón", Toast.LENGTH_LONG).show();
    }

    public void presionar2(View v) {
        Toast.makeText(this, "Se presionó otro botón", Toast.LENGTH_LONG).show();
    }
}
