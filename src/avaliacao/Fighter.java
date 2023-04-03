package avaliacao;

abstract class Fighter {
    private String name;
    private int life;
    private int victories;
    private int defeats;

    public Fighter(String name) {
        this.name = name;
        this.life = 100;
        this.victories = 0;
        this.defeats = 0;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getVictories() {
        return victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public boolean isAlive() {
        return life > 0;
    }

    public abstract void attack(Fighter opponent);

    public void takeDamage(int damage) {
        life = life - damage;
        if (life < 0) {
            life = 0;
        }
    }

    public void addVictory() {
        victories++;
    }

    public void addDefeat() {
        defeats++;
    }
}