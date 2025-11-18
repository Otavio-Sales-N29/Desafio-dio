package br_com_dio_desafio_dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }



    public Curso() {
    }

    // instancia = a criar


    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "{" +
                " titulo='" + getTitulo() + "'" +
                ", descricao='" + getDescricao() + "'" +
                ", cargaHoraria='" + getCargaHoraria() + "'" +
                "}";
    }

    // modificadores de acesso que determinam quem tem acesso aos atributos
    // private: só essa classe tem acesso aos atributos
    // protected: só essa classe e as classes filhas tem acesso aos atributos
    // public: qualquer classe tem acesso a esses atributos

}
