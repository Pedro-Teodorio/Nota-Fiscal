package com.senai.sp.nota_fiscal.Model;

public class Itens {

    private int id;
    private  String nome;
    private float preco;
    private int qtd;
    private int nr_nota;

    public Itens() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getNr_nota() {
        return nr_nota;
    }

    public void setNr_nota(int nr_nota) {
        this.nr_nota = nr_nota;
    }
}
