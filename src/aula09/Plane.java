package aula09;

public abstract class Plane {
    private String id;
    private String fabricante;
    private String modelo;
    private int ano_producao;
    private int npassageiros;
    private int velmax;
    private Tipo tipo;
    
    public Plane(String id, String fabricante, String modelo, int ano_producao, int npassageiros, int velmax, Tipo tipo) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano_producao = ano_producao;
        this.npassageiros = npassageiros;
        this.velmax = velmax;
        this.tipo = tipo;
    }

    public String getId() {
        return this.id;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno_producao() {
        return this.ano_producao;
    }

    public int getNpassageiros() {
        return this.npassageiros;
    }

    public void setNpassageiros(int npassageiros) {
        this.npassageiros = npassageiros;
    }

    public int getVelmax() {
        return this.velmax;
    }

    public void setVelmax(int velmax) {
        this.velmax = velmax;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", fabricante='" + getFabricante() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", ano_producao='" + getAno_producao() + "'" +
            ", npassageiros='" + getNpassageiros() + "'" +
            ", velmax='" + getVelmax() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }


}
