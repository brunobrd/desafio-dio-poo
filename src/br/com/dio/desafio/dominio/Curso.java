package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
       private int CargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + CargaHoraria;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "br.com.dio.desafio.dominio.Curso{" +
                "titulo='" + getTitulo()+ '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }
}

