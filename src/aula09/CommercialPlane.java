package aula09;

public class CommercialPlane extends Plane{
    private int ntripulantes;
    
    public CommercialPlane(String id, String fabricante, String modelo, int ano_producao, int npassageiros, int velmax, Tipo tipo, int ntripulantes) {
        super(id, fabricante, modelo, ano_producao, npassageiros, velmax, Tipo.COMERCIAL);
        this.ntripulantes = ntripulantes;
    }

    public int getNtripulantes() {
        return this.ntripulantes;
    }

    public void setNtripulantes(int ntripulantes) {
        this.ntripulantes = ntripulantes;
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
            " ntripulantes='" + getNtripulantes() + "'" +
            "}";
    }
}
