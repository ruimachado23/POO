package aula07;

public class Robo {
    private int id;
    private String tipo;
    private int golos;
    
    public Robo(int id, String tipo, int golos) {
        id++;
        this.tipo = tipo;
        this.golos = golos;
    }

    public int getId() {
        return this.id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo, int code) {
        switch (code) {
            case 1:
                this.tipo = "Guarda Redes";
            case 2:
                this.tipo = "Defesa";
            case 3:
                this.tipo = "Medio";
            case 4:
                this.tipo = "Avancado";
            default:
                System.out.println("Tipo de robo inválido");
                break;
        }
    }

    public int getGolos() {
        return this.golos;
    }

    public void setGolos(int golos) {
        this.golos = golos;
    }

    public void marcarGolo() {
        this.golos++;
    }
}
