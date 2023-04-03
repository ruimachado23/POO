package avaliacao1;
import java.util.Random;

class Boxer extends Fighter {
    private int range;

    public Boxer(String name, int range) {
        super(name);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    @Override
    public void attack(Fighter opponent) {
        Random random = new Random();
        int distance = random.nextInt(10) + 1;
        if (distance <= range) {
            int damage = random.nextInt(100) + 1;
            opponent.takeDamage(damage);
            System.out.println(getName() + " dá um soco em " + opponent.getName() + " causando " + damage + " de dano");
        } else {
            System.out.println(getName() + " falha o soco " + opponent.getName() + " porque está muito longe");
        }
    }
}