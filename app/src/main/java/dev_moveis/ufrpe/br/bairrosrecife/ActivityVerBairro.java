package dev_moveis.ufrpe.br.bairrosrecife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityVerBairro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_bairro);
        WebView webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
    }
}
