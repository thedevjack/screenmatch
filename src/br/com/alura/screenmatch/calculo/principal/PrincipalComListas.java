package br.com.alura.screenmatch.calculo.principal;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Star Wars", 1985);
        filme1.avalia(9);
        Filme filme2 = new Filme("Piratas do caribe", 2002);
        filme2.avalia(6);
        Serie serie = new Serie("Lost", 2002);
        var filme3 = new Filme("Dogville", 2003);
        filme1.avalia(10);

        // Criando lista de filmes
        ArrayList<Titulo> lista = new ArrayList<>();
        // adicionando filmes ao Array listaFilmes
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie);

//        for (Titulo item : lista
//        ) {
//            System.out.println(item.getNome());
//            // definindo item para receber os atributos de Filme, casting.
//            Filme filme = (Filme) item;
//            System.out.println("Classificacao " + filme.getClassificacao());
//        }

        for(Titulo item : lista) {
            System.out.println("Nome: " +item.getNome());
            // definindo item para receber os atributos de Filme, casting.
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " +filme.getClassificacao());
            }
        }
    }
}
