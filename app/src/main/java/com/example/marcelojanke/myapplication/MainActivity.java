package com.example.marcelojanke.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button BtnMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


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


    public void SendMessage(View view) {
        Intent i = new Intent(this,Contato.class);
        startActivity(i);
    }
}
