package aula08;

public class PesadoPassaEle extends Veiculo implements VeiculoElet{
    private int nquadro;
    private int capbagageira;
    private int potencia;
    private int nbat;
    private int capbateria;

    public PesadoPassaEle(String matricula, String marca, String modelo, int nquadro, int capbagageira, int potencia, int nbat, int capbateria) {
        super(matricula, marca, modelo);
        this.nquadro = nquadro;
        this.capbagageira = capbagageira;
        this.potencia = potencia;
        this.nbat = nbat;
        this.capbateria = 100;
    }

    public int getNbat() {
        return this.nbat;
    }

    public void setNbat(int nbat) {
        this.nbat = nbat;
    }

    public int getCapbateria() {
        return this.capbateria;
    }

    public void setCapbateria(int capbateria) {
        this.capbateria = capbateria;
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

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PesadoPassaEle)) {
            return false;
        }
        PesadoPassaEle pesadoPassaEle = (PesadoPassaEle) o;
        return nquadro == pesadoPassaEle.nquadro && capbagageira == pesadoPassaEle.capbagageira && potencia == pesadoPassaEle.potencia;
    }

    @Override
    public String toString() {
        return "{" +
            super.toString() +
            " nquadro='" + getNquadro() + "'" +
            ", capbagageira='" + getCapbagageira() + "'" +
            ", potencia='" + getPotencia() + "'" +
            "}";
    }

    public int autonomia() {
        return this.nbat * 100;
    }

    public void carregar(int percentagem) {
        nbat += percentagem;
    }
    
}
