package src.br.com.alura.minhasmusicas.principal;


import src.br.com.alura.minhasmusicas.model.Favoritos;
import src.br.com.alura.minhasmusicas.model.Musica;
import src.br.com.alura.minhasmusicas.model.Podcast;

public class Principal {
    public static void main(String[] args) {

// simular a reproducao usando for

        Musica musica = new Musica();
        musica.setTitulo("Animals");
        musica.setArtista("Pink Floyd");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Alura");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        Favoritos favoritos = new Favoritos();
        favoritos.inclui(musica);
        favoritos.inclui(podcast);

    }
}