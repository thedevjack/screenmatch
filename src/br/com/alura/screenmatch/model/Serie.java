package br.com.alura.screenmatch.model;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutorPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutorPorEpisodio() {
        return minutorPorEpisodio;
    }

    public void setMinutorPorEpisodio(int minutorPorEpisodio) {
        this.minutorPorEpisodio = minutorPorEpisodio;
    }

    // A anotacao @Override possibilita a sobrescrita de um metodo
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutorPorEpisodio;
    }

    @Override
    public double getSomaDasAvaliacoes() {
        return super.getSomaDasAvaliacoes();
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}