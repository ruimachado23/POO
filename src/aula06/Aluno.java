package aula06;
import aula05.DateYMD;

public class Aluno extends Pessoa{
    private int nmec = 100;
    private DateYMD dataIncricao;

    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD dataIncricao, int nmec) {
        super(nome, cc, dataNasc);
        this.dataIncricao = dataIncricao;
        this.nmec = nmec++;    
    }

    public int getNMec() {
        return this.nmec;
    }

    public DateYMD getDataIncricao() {
        return this.dataIncricao;
    }

    @Override
    public String toString() {
        return super.toString() + " nmec = " + nmec + ", data de inscrição = " + dataIncricao;
    }
}
