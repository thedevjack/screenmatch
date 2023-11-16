import br.com.alura.screenmatch.calculo.Calculadora;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        System.out.println("=======================PRIMEIRO FILME=======================");
        Filme filme1 = new Filme();

        filme1.setNome("Star Wars");
        filme1.setAnoDeLancamento(1985);
        filme1.setDuracaoEmMinutos(180);
        filme1.avalia(10);


        System.out.println("Média de avaliações do filme: " + filme1.pegaMedia());
        System.out.println("Duracao para maratonar Star Wars: " + filme1.getDuracaoEmMinutos());
        System.out.println("Duracao para maratonar Star Wars: " + filme1.getDuracaoEmMinutos());
        filme1.exibeFichaTecnica();

        System.out.println("=======================SEGUNDO FILME=======================");
        Filme filme2 = new Filme();

        filme2.setNome("Piratas do caribe");
        filme2.setAnoDeLancamento(2002);
        filme2.setDuracaoEmMinutos(200);


        filme2.avalia(19);
        filme2.avalia(9);
        filme2.avalia(8);


        System.out.println("Média de avaliações do filme: " + filme2.pegaMedia());
        System.out.println("Duracao para maratonar Piratas do caribe: " + filme2.getDuracaoEmMinutos());
        filme1.exibeFichaTecnica();

        System.out.println("=======================SERIES=======================");
        Serie serie = new Serie();

        serie.setNome("Lost");
        serie.setAnoDeLancamento(100);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutorPorEpisodio(20);
        serie.avalia(4);
        serie.exibeFichaTecnica();

        System.out.println("Ano de lancamento: " + serie.getAnoDeLancamento());
        System.out.println("Quantidade de temporadas: " + serie.getTemporadas());
        System.out.println("Quantidade de episodios: " + serie.getEpisodiosPorTemporada());
        System.out.println("Duracao para maratonar Lost: " + serie.getDuracaoEmMinutos());

        System.out.println("=======================CALCULADORA=======================");
        Calculadora calculadora = new Calculadora();

        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);

        System.out.println("Calculo tempo total filme: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(filme1);
        filtro.filtra(filme2);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filme3 = new Filme();
        filme3.setDuracaoEmMinutos(200);
        filme3.setNome("Dogville");
        filme3.setAnoDeLancamento(2003);
        filme3.avalia(10);

        // Criando lista de filmes
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        // adicionando filmes ao Array listaFilmes
        listaFilmes.add(filme1);
        listaFilmes.add(filme2);
        listaFilmes.add(filme3);

        // imprimindo o tamanho da lista .size()
        System.out.println("Tamanho da lista: " + listaFilmes.size());
        // .get() pega o primeiro valor da lista, no caso a posicao ZERO
        System.out.println("Primeiro filme: " + listaFilmes.get(0).getNome());

    }
}