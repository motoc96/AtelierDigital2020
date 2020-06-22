package project.strategy;

public class MonsterRangedStrategy implements AttackStrategy {
    @Override
    public void execute(Player player, Monster monster) {
        System.out.println("Monster shoots from his arms with poisonous needles!");
        //Obtaining the player's health after the monster attack
        player.setHp((player.getHp()-monster.getDmg()*randomMonsterFloat*1.5f));
        System.out.println("Your health:" + player.getHp());
    }
}
