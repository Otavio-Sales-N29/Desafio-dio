package br_com_dio_desafio_dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    // o extends quer dizer que a mentoria é filha da classe conteudo
    // tudo que eu tenho em mentoria eu vou ter em conteúdo mas nem tudo que eu
    // tenho em conteudo vai ter em mentoria

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                " titulo='" + getTitulo() + "'" +
                ", descricao='" + getDescricao() + "'" +
                ", data='" + getData() + "'" +
                "}";
    }

    // LocalDate é uma das classes do java que nos permitem trabahar com datas

}
