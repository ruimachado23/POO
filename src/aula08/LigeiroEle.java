package aula08;

public class LigeiroEle extends AutomovelLigeiro implements VeiculoElet{
    private int nbat;
    private int capbateria;

    public LigeiroEle(String matricula, String marca, String modelo, int potencia, int nquadro, int capbagageira, int nbat, int capbateria) {
        super(matricula, marca, modelo, potencia, nquadro, capbagageira);
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LigeiroEle)) {
            return false;
        }
        LigeiroEle ligeiroEle = (LigeiroEle) o;
        return nbat == ligeiroEle.nbat && capbateria == ligeiroEle.capbateria;
    }

    public int autonomia() {
        return this.nbat;
    }

    public void carregar(int percentagem) {
        nbat += percentagem;
        if (nbat > 100) {
            nbat = 100;
        }
    }

    @Override
    public String toString() {
        return "{" +
            super.toString() +
            " nbat='" + getNbat() + "'" +
            ", capbateria='" + getCapbateria() + "'" +
            "}";
    }
}
