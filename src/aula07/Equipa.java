package aula07;

public class Equipa {
    private String nome;
    private String responsavel;
    private int marcados;
    private int sofridos;
    private Robo[] robos;

    public Equipa(String nome, String responsavel, int marcados, int sofridos, Robo[] robos) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.marcados = marcados;
        this.sofridos = sofridos;
        this.robos = robos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getMarcados() {
        return this.marcados;
    }

    public void setMarcados(int marcados) {
        this.marcados = marcados;
    }

    public int getSofridos() {
        return this.sofridos;
    }

    public void setSofridos(int sofridos) {
        this.sofridos = sofridos;
    }

    public Robo[] getRobos() {
        return this.robos;
    }

    public void setRobos(Robo[] robos) {
        this.robos = robos;
    }

}
