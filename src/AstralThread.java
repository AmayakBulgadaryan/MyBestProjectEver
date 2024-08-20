public class AstralThread extends Thread {

    private Mage mage;

    public AstralThread(Mage mage) {
        this.mage = mage;
        start();
    }

    @Override
    public void run() {
        if (mage.getDisembodied()) {
            try {
                Thread.currentThread().sleep(8);
                mage.setDisembodied(false);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
