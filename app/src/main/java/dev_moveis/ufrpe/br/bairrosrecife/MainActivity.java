package dev_moveis.ufrpe.br.bairrosrecife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String array[] = new String [] {"Macaxeira","Imbiribeira","Ibura","Ipsep","Torreão","Casa Amarela","Boa Viagem",
                "Jenipapo","Santo Amaro","Madalena","Boa Vista","Dois Irmãos","Cais do Porto","Brasilite",
                "Cdu","Caxangá","Capibaribe","Sertão"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //WebView webview = (WebView) findViewById(R.id.webview);
        //webview.setWebViewClient(new WebViewClient());

        listview = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
        listview.setAdapter(arrayAdapter);
    }
}
