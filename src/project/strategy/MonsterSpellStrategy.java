package project.strategy;

public class MonsterSpellStrategy implements AttackStrategy{

    @Override
    public void execute(Player player, Monster monster) {
        System.out.println("Monster casted a fire spell on you..");
        player.setHp((player.getHp()-monster.getDmg()*randomMonsterFloat*2));
        System.out.println("Your health:" + player.getHp());
    }
}
