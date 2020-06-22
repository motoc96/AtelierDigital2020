package project.strategy;

public class MonsterSpellStrategy implements AttackStrategy{

    @Override
    public void execute(Player player, Monster monster) {
        System.out.println("Monster casted a fire spell on you..");
        //Obtaining the player's health after the monster attack
        player.setHp((player.getHp()-monster.getDmg()*randomMonsterFloat*1.7f));
        System.out.println("Your health:" + player.getHp());
    }
}
