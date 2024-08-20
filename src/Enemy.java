public class Enemy implements Mortal {

    private int health;

    private int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public void attackHero(Hero hero){
        hero.takeDamage(damage);
        System.out.println("Enemy attacks");
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
