package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;
    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    // serve para parar de imprimir Filme@16b98e56 e sim imprimir os valores
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}