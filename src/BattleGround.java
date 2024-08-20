import java.awt.*;

public class BattleGround {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Rick", 200);
        Archer archer = new Archer("Joana", 120);
        Mage mage = new Mage("Apollo", 80);
        Orc orc = new Orc(170, 20);
        Wolf wolf = new Wolf(100, 15);
        Titan titan = new Titan(300, 40);

        warrior.attackEnemy(orc);
        orc.berserk();
        orc.attackHero(warrior);
        warrior.attackEnemy(wolf);
        wolf.attackHero(warrior);
        wolf.bloodBite(warrior);
        System.out.println(warrior.isAlive());
        titan.stun(warrior);

        orc.attackHero(mage);
        mage.attackEnemy(orc);
        mage.astral();
        orc.attackHero(mage);
        archer.powerShot(orc);
        titan.attackHero(mage);
    }

}
