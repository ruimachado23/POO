package aula06;
import aula05.DateYMD;

public class Bolseiro extends Aluno{
    private Professor orientador;
    private int montante;

    public Bolseiro(String nome,int cc,  DateYMD dataNasc, Professor orientador, int montante, int nmec) {
        super(nome, cc, dataNasc, null, nmec);
        this.orientador = orientador;
        this.montante = montante;
    }

    public Professor getOrientador() {
        return this.orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public int getBolsa() {
        return this.montante;
    }

    public void setBolsa(int montante) {
        this.montante = montante;
    }


    @Override
    public String toString() {
        return super.toString() + " orientador = " + orientador + ", montante = " + montante;
    }

}
