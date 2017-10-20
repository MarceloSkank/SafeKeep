package com.example.marcelojanke.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Mapa extends AppCompatActivity {
    private WebView webView;
    private WebSettings webSettings;
    private LinearLayout lista;
    private Button button;

    public enum Tipo{
        Mapa,Contato
    }
    public static Tipo tipoNavegador = Tipo.Contato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mapa);
        getSupportActionBar().hide();
        webView = (WebView)findViewById(R.id.webView);
        webSettings = webView.getSettings();
        lista = (LinearLayout) findViewById(R.id.listItem);
        setButtons();
        switch (tipoNavegador) {
            case Mapa:
                webView.loadUrl("https://www.facebook.com");
                break;
            case Contato:
                webView.loadUrl("https://www.facebook.com");
                break;
        }
        webSettings.setJavaScriptEnabled(true);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int visibleAtual = lista.getVisibility();

                if (visibleAtual == LinearLayout.GONE)
                    lista.setVisibility(LinearLayout.VISIBLE);
                else
                    lista.setVisibility(LinearLayout.GONE);
            }
        });

    }
    private void setButtons() {
        int quantChild = lista.getChildCount();

        button = (Button) findViewById(R.id.botaoMenu);
        for (int i = 0; i < quantChild; i++) {
            Button botaoAtual = (Button)lista.getChildAt(i);

            botaoAtual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), new String("Apertou um botão"), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
