package dev_moveis.ufrpe.br.bairrosrecife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView listview;
    public static final String EXTRA_LINK = "com.link_teste";
    private ArrayList<Bairro> bairros;
    String link = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        bairros = new ArrayList<Bairro>();
        Bairro macaxeira = new Bairro("https://pt.wikipedia.org/wiki/Macaxeira_(Recife)","Macaxeira");
        Bairro imbiribeira = new Bairro("https://pt.wikipedia.org/wiki/Imbiribeira","Imbiribeira");
        Bairro ibura = new Bairro("https://pt.wikipedia.org/wiki/Ibura","Ibura");
        Bairro ipsep = new Bairro("https://pt.wikipedia.org/wiki/Ipsep","Ipsep");
        Bairro torreao = new Bairro("https://pt.wikipedia.org/wiki/Torre%C3%A3o_(Recife)","Torreão");
        Bairro casaAmarela = new Bairro("https://pt.wikipedia.org/wiki/Casa_Amarela_(Recife)","Casa Amarela");
        Bairro boaViagem = new Bairro("https://pt.wikipedia.org/wiki/Boa_Viagem_(Recife)","Boa Viagem");
        Bairro jenipapo = new Bairro("https://pt.wikipedia.org/wiki/C%C3%B3rrego_do_Jenipapo","Jenipapo");
        Bairro santoAmaro = new Bairro("https://pt.wikipedia.org/wiki/Santo_Amaro_(Recife)","Santo Amaro");
        Bairro madalena = new Bairro("https://pt.wikipedia.org/wiki/Madalena_(Recife)","Madalena");
        Bairro boaVista = new Bairro("https://pt.wikipedia.org/wiki/Boa_Vista_(Recife)","Boa Vista");
        Bairro doisIrmaos = new Bairro("https://pt.wikipedia.org/wiki/Dois_Irm%C3%A3os_(Recife)","Dois Irmãos");
        Bairro caisDoPorto = new Bairro("https://pt.wikipedia.org/wiki/Porto_do_Recife","Cais do Porto");
        Bairro caxangah = new Bairro("https://pt.wikipedia.org/wiki/Caxang%C3%A1_(Recife)","Caxangá");
        Bairro brasilite = new Bairro("https://pt.wikipedia.org/wiki/V%C3%A1rzea_(Recife)","Brasilite");
        Bairro cdu = new Bairro("https://pt.wikipedia.org/wiki/Cidade_Universit%C3%A1ria_(Recife)","CDU");
        Bairro capibaribe = new Bairro("https://pt.wikipedia.org/wiki/Rio_Capibaribe","Capibaribe");
        Bairro sertao = new Bairro("http://bit.ly/2ZOMO5E","Sertão");

        bairros.add(macaxeira);
        bairros.add(imbiribeira);
        bairros.add(ibura);
        bairros.add(ipsep);
        bairros.add(torreao);
        bairros.add(casaAmarela);
        bairros.add(boaViagem);
        bairros.add(jenipapo);
        bairros.add(santoAmaro);
        bairros.add(madalena);
        bairros.add(boaVista);
        bairros.add(doisIrmaos);
        bairros.add(caisDoPorto);
        bairros.add(caxangah);
        bairros.add(brasilite);
        bairros.add(cdu);
        bairros.add(capibaribe);
        bairros.add(sertao);

        String array[] = new String [] {macaxeira.getNome(),imbiribeira.getNome(),ibura.getNome(),ipsep.getNome(),torreao.getNome(),casaAmarela.getNome(),boaViagem.getNome(),
                jenipapo.getNome(),santoAmaro.getNome(),madalena.getNome(),boaVista.getNome(),doisIrmaos.getNome(),caisDoPorto.getNome(),caxangah.getNome(),brasilite.getNome(),
                cdu.getNome(),capibaribe.getNome(),sertao.getNome()};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nomeBairro = parent.getItemAtPosition(position).toString();
                verBairro(nomeBairro);
                //verBairro(onItemClickListener.getClass().);
            }
        });
    }

    private void verBairro(String nome) {
        Toast toast = Toast.makeText(this,nome,Toast.LENGTH_LONG);
        toast.show();
        link = linkBairro(nome);

        Intent intent = new Intent(getApplicationContext(), ActivityVerBairro.class);
        intent.putExtra(EXTRA_LINK,link);
        startActivity(intent);
    }

    private String linkBairro(String nomeBairro) {
        String resultado = "";
        for (Bairro bairro: bairros) {
            if(bairro.getNome().equals(nomeBairro)) {
                resultado = bairro.getLinkBairro();
            }
        }
        return resultado;
    }
}
