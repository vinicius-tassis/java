package br.com.vta.model;

public class Mensagem {
    private String nome;
    private String mensagem;

    // Construtor
    public Mensagem(String nome, String mensagem) {
        this.nome = nome;
        this.mensagem = mensagem;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}

