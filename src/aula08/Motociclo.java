package aula08;

import java.util.Objects;

public class Motociclo extends Veiculo{
    private int potencia;
    private String tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia, String tipo) {
        super(matricula, marca, modelo);
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "{" +
            super.toString() +
            " potencia='" + getPotencia() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Motociclo)) {
            return false;
        }
        Motociclo motociclo = (Motociclo) o;
        return potencia == motociclo.potencia && Objects.equals(tipo, motociclo.tipo);
    }
}
