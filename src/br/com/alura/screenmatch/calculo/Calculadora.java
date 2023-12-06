package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.model.Titulo;

public class Calculadora {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme filme){
//        tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie){
//        tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println(titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
