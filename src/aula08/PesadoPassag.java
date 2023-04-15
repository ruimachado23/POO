package aula08;

public class PesadoPassag extends Veiculo{
    private int potencia;
    private int nquadro;
    private int peso;
    private int maxpassag;

    public PesadoPassag(String matricula, String marca, String modelo, int potencia, int nquadro, int peso, int maxpassag) {
        super(matricula, marca, modelo);
        this.potencia = potencia;
        this.nquadro = nquadro;
        this.peso = peso;
        this.maxpassag = maxpassag;
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

    public int getMaxpassag() {
        return this.maxpassag;
    }

    public void setMaxpassag(int maxpassag) {
        this.maxpassag = maxpassag;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PesadoPassag)) {
            return false;
        }
        PesadoPassag pesadoPassag = (PesadoPassag) o;
        return potencia == pesadoPassag.potencia && nquadro == pesadoPassag.nquadro && peso == pesadoPassag.peso && maxpassag == pesadoPassag.maxpassag;
    }


    @Override
    public String toString() {
        return "{" +
            super.toString() +
            " potencia='" + getPotencia() + "'" +
            ", nquadro='" + getNquadro() + "'" +
            ", peso='" + getPeso() + "'" +
            ", maxpassag='" + getMaxpassag() + "'" +
            "}";
    }
    


}
