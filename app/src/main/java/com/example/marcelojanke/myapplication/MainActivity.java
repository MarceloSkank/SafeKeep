package com.example.marcelojanke.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private Button BtnMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnMapa = (Button) findViewById(R.id.btnMapa);
        BtnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context contexto = getApplicationContext();
                CharSequence string = "Evento Aplicado";
                int duracao = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(contexto,string,duracao);
                toast.show();

            }
        });
    }
}
