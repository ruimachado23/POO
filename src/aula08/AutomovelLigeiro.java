package aula08;

public class AutomovelLigeiro extends Veiculo {
    private int potencia;
    private int nquadro;
    private int capbagageira;

    public AutomovelLigeiro(String matricula, String marca, String modelo, int potencia, int nquadro, int capbagageira) {
        super(matricula, marca, modelo);
        this.potencia = potencia;
        this.nquadro = nquadro;
        this.capbagageira = capbagageira;
    }
    
    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNquadro() {
        return this.nquadro;
    }

    public void setNquadro(int nquadro) {
        this.nquadro = nquadro;
    }

    public int getCapbagageira() {
        return this.capbagageira;
    }

    public void setCapbagageira(int capbagageira) {
        this.capbagageira = capbagageira;
    }
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AutomovelLigeiro)) {
            return false;
        }
        AutomovelLigeiro automovelLigeiro = (AutomovelLigeiro) o;
        return potencia == automovelLigeiro.potencia && nquadro == automovelLigeiro.nquadro && capbagageira == automovelLigeiro.capbagageira;
    }

    @Override
    public String toString() {
        return "{" +
            super.toString() +
            " potencia='" + getPotencia() + "'" +
            ", nquadro='" + getNquadro() + "'" +
            ", capbagageira='" + getCapbagageira() + "'" +
            "}";
    }

}
