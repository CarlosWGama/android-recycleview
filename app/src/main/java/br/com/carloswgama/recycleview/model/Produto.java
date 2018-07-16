package br.com.carloswgama.recycleview.model;

public class Produto {

    private String nome;
    private double preco;
    private double imagem;

    public Produto(String nome, double preco, double imagem) {
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getImagem() {
        return imagem;
    }

    public void setImagem(double imagem) {
        this.imagem = imagem;
    }
}
