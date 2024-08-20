public class StunThread extends Thread {

    private Hero hero;

    public StunThread(Hero hero) {
        this.hero = hero;
        start();
    }

    @Override
    public void run() {
        if (hero.getStun()) {
            try {
                Thread.currentThread().sleep(5000);
                hero.setStun(false);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
