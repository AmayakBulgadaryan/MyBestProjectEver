public class Titan extends Enemy{

    private int damage;

    private int health;

    public Titan(int health, int damage) {
        super(health, damage);
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(damage);
        System.out.println("Titan attacks");
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    public void stun(Hero hero) {
        hero.stuned();
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
        return  health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
