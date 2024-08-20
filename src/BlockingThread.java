public class BlockingThread extends Thread {

    private Warrior warrior;

    public BlockingThread(Warrior warrior) {
        this.warrior = warrior;
        start();
    }

    public void run() {
        if (warrior.getShield()) {
            try {
                Thread.currentThread().sleep(3000);
                warrior.setShield(false);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
