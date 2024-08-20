public class BleedingThread extends Thread {

    private Hero hero;

    public BleedingThread(Hero hero) {
        this.hero = hero;
        start();
    }

    @Override
    public void run() {
        int time = 0;
        while (hero.getBleeding() || time != 15) {
            hero.setHealth(hero.getHealth() - 1);
            time++;
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
