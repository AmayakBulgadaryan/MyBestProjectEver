public class Warrior extends Hero {

    private String name;

    private int health;

    private boolean stun;

    private boolean bleeding;

    private boolean shield;

    public Warrior(String name, int health) {
        super(name, health);
        this.name = name;
        this.health = health;
    }

//    @Override
//    public void run() {
//        if (stun) {
//            try {
//                Thread.currentThread().sleep(5000);
//                stun = !stun;
//                return;
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        int time = 0;
//        while (bleeding || time != 15) {
//            health -= 1 ;
//            time++;
//            try {
//                Thread.currentThread().sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        if (bleeding) {
//            bleeding = ! bleeding;
//        }
//    }

    @Override
    public void attackEnemy(Enemy enemy){
        if (!stun) {
            enemy.takeDamage(20);
            System.out.println("Warrior attacks");
        }
    }

    public void takeDamage(int damage) {
        if (!shield) {
            health -= damage;
        }
    }

    public void blocking() {
        shield = true;
        BlockingThread blockingThread = new BlockingThread(this);
    }

    public void stuned() {
        stun = true;
        StunThread stunThread = new StunThread(this);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void bleeding() {
        bleeding = true;
        BleedingThread bleedingThread = new BleedingThread(this);
    }

    public boolean getStun() {
        return stun;
    }

    public void setStun(boolean stun) {
        this.stun = stun;
    }

    public boolean getBleeding() {
        return bleeding;
    }

    public void setBleeding(boolean bleeding) {
        this.bleeding = bleeding;
    }

    public boolean isBleeding() {
        return bleeding;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public boolean getShield() {
        return shield;
    }

}
