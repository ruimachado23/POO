package aula06;
import java.util.ArrayList;

public class Contactos {
    private static int id;
    private String pessoa;
    private String email;
    private int ntelemovel;
    static ArrayList<Contactos> contactList = new ArrayList<Contactos>();
    
    public Contactos(String pessoa, String email, int ntelemovel) {
        id++;
        this.pessoa = pessoa;
        this.email = email;
        this.ntelemovel = ntelemovel;
    }

    public String getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email.matches(".*@.*\\.(com|pt)$")){
            this.email = email;
        }
        else {
            System.out.println("Email inválido");
        }
    }

    public int getNtelemovel() {
        return this.ntelemovel;
    }

    public void setNtelemovel(int ntelemovel) {
        if (ntelemovel > 0 && ntelemovel < 1000000000) {
            this.ntelemovel = ntelemovel;
        }
        else{
            System.out.println("Número inválido");
        }
    }

    public static int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" +
            " nome = '" + getPessoa() + "'" +
            ", email = '" + getEmail() + "'" +
            ", ntelemovel = '" + getNtelemovel() + "'" +
            "}";
    }

}
