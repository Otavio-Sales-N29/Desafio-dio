package br_com_dio_desafio_dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //o static quer dizer que eu vou poder acessa o XP_PADRAO fora da classe conteudo
    //abstract quer dizer que eu não consigo criar um conteúdo



}
