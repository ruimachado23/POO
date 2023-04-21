package aula09;

public class MilitaryPlane extends Plane{
    private int nmunicoes;

    public MilitaryPlane(String id, String fabricante, String modelo, int ano_producao, int npassageiros, int velmax, Tipo tipo, int nmunicoes) {
        super(id, fabricante, modelo, ano_producao, npassageiros, velmax, Tipo.MILITAR);
        this.nmunicoes = nmunicoes;
    }

    public int getNmunicoes() {
        return this.nmunicoes;
    }

    public void setNmunicoes(int nmunicoes) {
        this.nmunicoes = nmunicoes;
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
            " tipo='" + getTipo() + "'" +
            " nmunicoes='" + getNmunicoes() + "'" +
            "}";
    }
}
