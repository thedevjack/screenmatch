package br.com.alura.minhasmusicas.model;

public class Favoritos {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " considerado mundialmente Greatest Hits ");
        } else {
            System.out.println(audio.getTitulo() + " tambem e considerado um dos mais tocados!");
        }
    }

}
