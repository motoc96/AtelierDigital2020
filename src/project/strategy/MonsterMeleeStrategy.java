package project.strategy;

import java.util.Random;

public class MonsterMeleeStrategy implements AttackStrategy{

    @Override
    public void execute(Player player, Monster monster) {
        System.out.println("Monster injured you with his claws!!");;
        //Obtaining the player's health after the monster attack
        player.setHp((player.getHp()-monster.getDmg()*randomMonsterFloat*1.2f));
        System.out.println("Your health:" + player.getHp());
    }
}
