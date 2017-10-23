package com.example.marcelojanke.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button BtnMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();



    }
    public void Web(View view){
        Mapa.tipoNavegador = Mapa.Tipo.Contato;
        Intent i = new Intent(this,Mapa.class);
        startActivity(i);
    }



    public void SendMessage(View view) {
        Intent i = new Intent(this,Socorro.class);
        startActivity(i);
    }
}
