public class TrainingGround {

    public static void main(String[] arg) {
        Hero warrior = new Warrior("Polly", 100);
        Hero archer = new Archer("Klod", 70);
        Hero mage = new Mage("Juda", 60);
        warrior.attackEnemy(new Enemy(50, 10));
        archer.attackEnemy(new Enemy(55, 15));
        mage.attackEnemy(new Enemy(45, 20));
    }

}
