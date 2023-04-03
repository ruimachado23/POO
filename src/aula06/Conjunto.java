package aula06;
import java.util.Arrays;

public class Conjunto {
    private int[] elementos;
    private int tamanho;
    
    public Conjunto() {
        this.elementos = new int[10];
        this.tamanho = 0;
    }
    
    private boolean contem(int n) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public void insert(int n) {
        if (!contem(n)) {
            if (this.tamanho == this.elementos.length) {
                this.elementos = Arrays.copyOf(this.elementos, this.elementos.length*2);
            }
            this.elementos[this.tamanho++] = n;
        }
    }
    
    public boolean contains(int n) {
        return contem(n);
    }
    
    public void remove(int n) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i] == n) {
                for (int j = i; j < this.tamanho-1; j++) {
                    this.elementos[j] = this.elementos[j+1];
                }
                this.tamanho--;
                break;
            }
        }
    }
    
    public void empty() {
        this.tamanho = 0;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.tamanho; i++) {
            sb.append(this.elementos[i]).append(" ");
        }
        return sb.toString();
    }
    
    public int size() {
        return this.tamanho;
    }
    
    public Conjunto combine(Conjunto add) {
        Conjunto uniao = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
            uniao.insert(this.elementos[i]);
        }
        for (int i = 0; i < add.tamanho; i++) {
            uniao.insert(add.elementos[i]);
        }
        return uniao;
    }
    
    public Conjunto subtract(Conjunto dif) {
        Conjunto diferenca = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
            if (!dif.contem(this.elementos[i])) {
                diferenca.insert(this.elementos[i]);
            }
        }
        return diferenca;
    }
    
    public Conjunto intersect(Conjunto inter) {
        Conjunto intersecao = new Conjunto();
        for (int i = 0; i < this.tamanho; i++) {
            if (inter.contem(this.elementos[i])) {
                intersecao.insert(this.elementos[i]);
            }
        }
        return intersecao;
    }
}
