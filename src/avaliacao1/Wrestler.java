package avaliacao1;
import java.util.Random;

class Wrestler extends Fighter {
    private int speed;

    public Wrestler(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void attack(Fighter opponent) {
        Random random = new Random();
        int distance = random.nextInt(10) + 1;
        if (speed > distance) {
            int damage = random.nextInt(100) + 1;
            opponent.takeDamage(damage);
            System.out.println(getName() + " golpeia " + opponent.getName() + " causando " + damage + " de dano");
        } else {
            System.out.println(getName() + " falha o golpe em " + opponent.getName() + " porque está muito longe");
        }
    }
}