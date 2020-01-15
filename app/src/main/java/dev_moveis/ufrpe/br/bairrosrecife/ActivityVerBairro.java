package dev_moveis.ufrpe.br.bairrosrecife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ActivityVerBairro extends AppCompatActivity {

    private WebView webview;
    //public ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_bairro);
        Intent intent = getIntent();
        String link = intent.getStringExtra(MainActivity.EXTRA_LINK);

        webview = findViewById(R.id.webView);
         /*webview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
                setTitle("carregando...");
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
                setTitle(view.getTitle());
            }
        });*/
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(link);

    }
}
