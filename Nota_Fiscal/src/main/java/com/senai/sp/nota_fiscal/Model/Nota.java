package com.senai.sp.nota_fiscal.Model;

import java.time.LocalDate;
import java.util.List;

public class Nota {

    private  int nr_nota;
    private String cliente;
    private LocalDate dt_emissao;
    private List<Itens> itens;

    public Nota() {
    }

    public int getNr_nota() {
        return nr_nota;
    }

    public void setNr_nota(int nr_nota) {
        this.nr_nota = nr_nota;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDt_emissao() {
        return dt_emissao;
    }

    public void setDt_emissao(LocalDate dt_emissao) {
        this.dt_emissao = dt_emissao;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }
}

