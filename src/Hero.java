public abstract class Hero implements Mortal {

   private String name;

   private int health;

   private boolean stun;

   private boolean bleeding;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public boolean getStun() {
        return stun;
    }

    public void setStun(boolean stun) {
        this.stun = stun;
    }

    public String getName() {
        return this.name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public abstract void stuned();

    public abstract void bleeding();

    public abstract void setBleeding(boolean bleeding);

    public abstract boolean getBleeding();

    public boolean isBleeding() {
        return bleeding;
    }

}
