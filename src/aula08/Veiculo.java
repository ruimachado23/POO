package aula08;

public class Veiculo implements KmPercorridosInterface {
    private String matricula;
    private String marca;
    private String modelo;
    private int kmTrajeto;
    private int kmTotal;

    public Veiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kmTrajeto = 0;
        this.kmTotal = 0;
    }


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void trajeto(int quilometros){
        kmTrajeto = quilometros;
        kmTotal += kmTrajeto;
    }

    public int ultimoTrajeto(){
        return kmTrajeto;
    }

    public int distanciaTotal(){
        return kmTotal += kmTrajeto;
    }


    @Override
    public String toString() {
        return 
            " matricula='" + getMatricula() + "'" +
            ", marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", kmTrajeto='" + ultimoTrajeto() + "'" +
            ", kmTotal='" + distanciaTotal() + "',";
            
    }

}
