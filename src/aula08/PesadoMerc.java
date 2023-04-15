package aula08;

public class PesadoMerc extends Veiculo{
    private int potencia;
    private int nquadro;
    private int peso;
    private int cargamax;

    public PesadoMerc(String matricula, String marca, String modelo, int potencia, int nquadro, int peso, int cargamax) {
        super(matricula, marca, modelo);
        this.potencia = potencia;
        this.nquadro = nquadro;
        this.peso = peso;
        this.cargamax = cargamax;
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

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCargamax() {
        return this.cargamax;
    }

    public void setCargamax(int cargamax) {
        this.cargamax = cargamax;
    }

    @Override
    public String toString() {
        return "{" +
            super.toString() +
            " potencia='" + getPotencia() + "'" +
            ", nquadro='" + getNquadro() + "'" +
            ", peso='" + getPeso() + "'" +
            ", cargamax='" + getCargamax() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PesadoMerc)) {
            return false;
        }
        PesadoMerc pesadoMerc = (PesadoMerc) o;
        return potencia == pesadoMerc.potencia && nquadro == pesadoMerc.nquadro && peso == pesadoMerc.peso && cargamax == pesadoMerc.cargamax;
    }
}
