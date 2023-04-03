package aula06;
import aula05.DateYMD;

public class Professor extends Pessoa {
    private int code;
    private String categoria;
    private String departamento;

    public Professor(String nome, int cc, DateYMD dataNasc, int code, String categoria, String departamento) {
        super(nome, cc, dataNasc);
        this.code = code;
        this.categoria = categoria;
        this.departamento = departamento;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(){
        switch (code){
            case 0:
                categoria = "Auxiliar";
            case 1:
                categoria = "Associado";
            case 2:
                categoria = "Catedrático";
            default:
                System.out.println("Código inválido");
                break;
        }
    }

    public String toString(){
        return super.toString() + " categoria = " + categoria + "," + "departamento = " + departamento;
    }
}

