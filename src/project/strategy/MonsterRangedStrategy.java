package project.strategy;

public class MonsterRangedStrategy implements AttackStrategy {
    @Override
    public void execute(Player player, Monster monster) {
        System.out.println("Monster shoots from his arms with poisonous needles!");
        player.setHp((player.getHp()-monster.getDmg()*randomMonsterFloat*2));
        System.out.println("Your health:" + player.getHp());
    }
}
