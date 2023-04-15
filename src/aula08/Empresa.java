package aula08;

public class Empresa {
    private String nome;
    private String codpostal;
    private String email;
    private Veiculo[] veiculos;

    public Empresa(String nome, String codpostal, String email, Veiculo[] veiculos) {
        this.nome = nome;
        this.codpostal = codpostal;
        this.email = email;
        this.veiculos = veiculos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodpostal() {
        return this.codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Veiculo[] getVeiculos() {
        return this.veiculos;
    }

    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }

}
