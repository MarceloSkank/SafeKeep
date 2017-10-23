package com.example.marcelojanke.myapplication;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class Blue extends AppCompatActivity {
    BluetoothAdapter bluetoothAdapter;
    private final int ATIVA_BLUETOOTH = 1;
    private ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_blue);
        lista = (ListView) findViewById(R.id.Lista);


        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null){
            Toast.makeText(getApplicationContext(),new String("O despositivo nao aceita Bluetooth"),Toast.LENGTH_LONG).show();
        }else if(!bluetoothAdapter.isEnabled()) {
            Intent Enable = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(Enable, ATIVA_BLUETOOTH);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case ATIVA_BLUETOOTH:
                if(requestCode == Activity.RESULT_OK) {
                    Toast.makeText(getApplicationContext(),new String("Ativado!!"),Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),new String("Desativado :("),Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}


