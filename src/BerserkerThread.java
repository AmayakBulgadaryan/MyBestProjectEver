public class BerserkerThread extends Thread {

    private Enemy enemy;

    public BerserkerThread(Enemy enemy) {
        this.enemy = enemy;
        start();
    }

    @Override
    public void run() {
        enemy.setDamage(enemy.getDamage() + 30);
        try {
            Thread.currentThread().sleep(6000);
            enemy.setDamage(enemy.getDamage() - 30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
