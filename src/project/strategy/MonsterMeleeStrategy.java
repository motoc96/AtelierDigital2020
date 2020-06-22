package project.strategy;

import java.util.Random;

public class MonsterMeleeStrategy implements AttackStrategy{

    @Override
    public void execute(Player player, Monster monster) {
        System.out.println("Monster injured you with his claws!!");;
        player.setHp((player.getHp()-monster.getDmg()*randomMonsterFloat*2));
        System.out.println("Your health:" + player.getHp());
    }
}
