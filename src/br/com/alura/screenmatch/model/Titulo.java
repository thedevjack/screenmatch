package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.excecao.ErroConversaoException;
import com.google.gson.annotations.SerializedName;

// usando a Interface comparable e ele compara titulo com titulo
public class Titulo implements Comparable<Titulo> {

    private String nome;
    //@SerializedName = define o valor/nome que vai ser recebido no json
    //@SerializedName("Year")
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length() > 4){
            throw new ErroConversaoException("Não foi possivel converter o ano mais que 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public void exibeFichaTecnica() {
        System.out.println("FICHA TECNICA");
        System.out.println("Nome: " + nome);
        System.out.println("Incluido no plano?: " + incluidoNoPlano);
        System.out.println("Total de avaliacoes: " + totalDeAvaliacoes);
        System.out.println("Media das avaliacoes: " + somaDasAvaliacoes);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes = +nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        //passando o nome do titulo e passando o nome do parametro que vai receber
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return
                "(nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", duracaoEmMinutos=" + duracaoEmMinutos + ")"
                ;
    }
}