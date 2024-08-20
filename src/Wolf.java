public class Wolf extends Enemy {

    private int health;

    private int damage;

    public Wolf(int health, int damage) {
        super(health, damage);
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(damage);
        System.out.println("Wolf attacks");
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    public void bloodBite(Hero hero) {
        hero.bleeding();
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
