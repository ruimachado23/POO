package aula06;

import aula05.DateYMD;

public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;

    public Pessoa(String nome, int cc, DateYMD dataNasc) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getName() {
        return this.nome;
    }

    public void setName(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public int getCc() {
        return this.cc;
    }

    public void setCc(int cc) {
        if (cc > 0 && cc < 999999999) {
            this.cc = cc;
        }
    }

    public DateYMD getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(DateYMD dataNasc) {

        String data[] = dataNasc.toString().split("/");

        int year = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int day = Integer.parseInt(data[2]);
        
        if (DateYMD.valid(year, month, day)){
            this.dataNasc = dataNasc;
        }
    }


    @Override
    public String toString() {
        return "nome = " + nome + ", cc = " + cc + ", data de nascimento = " + dataNasc;
    }
}

