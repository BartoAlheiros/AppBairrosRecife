package dev_moveis.ufrpe.br.bairrosrecife;

import java.io.Serializable;

public class Bairro implements Serializable {
    private String linkWikiBairro;
    private String nomeBairro;

    public Bairro(String linkWiki, String nomeBairro) {
        linkWikiBairro = linkWiki;
        this.nomeBairro = nomeBairro;
    }

    public Bairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public String getLinkBairro() {
        return linkWikiBairro;
    }

    public String getNome() {
        return nomeBairro;
    }

    @Override
    public String toString() {
        return nomeBairro;
    }
}
