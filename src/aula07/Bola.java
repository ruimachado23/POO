package aula07;

public class Bola extends Objeto_Movel{
    private String cor;

    public Bola(String cor, double distance, double newy, double newx) {
        super(distance, newy, newx);
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
