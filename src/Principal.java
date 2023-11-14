import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        Serie serie = new Serie();

        System.out.println("=======================FILMES=======================");
        meuFilme.setNome("Star Wars");
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.exibeFichaTecnica();
        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());

        System.out.println("=======================SERIES=======================");
        serie.avalia(9);
        serie.avalia(8);
        serie.avalia(9);
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();



    }
}