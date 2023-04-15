package aula08;

public class Taxi extends AutomovelLigeiro{
    private int nlicenca;

    public Taxi(String matricula, String marca, String modelo, int potencia, int nquadro, int capbagageira, int nlicenca) {
        super(matricula, marca, modelo, potencia, nquadro, capbagageira);
        this.nlicenca = nlicenca;
    }

    public int getNlicenca() {
        return this.nlicenca;
    }

    public void setNlicenca(int nlicenca) {
        this.nlicenca = nlicenca;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Taxi)) {
            return false;
        }
        Taxi taxi = (Taxi) o;
        return nlicenca == taxi.nlicenca;
    }

    @Override
    public String toString() {
        return "{" +
            super.toString() +
            " nlicenca='" + getNlicenca() + "'" +
            "}";
    }
}
