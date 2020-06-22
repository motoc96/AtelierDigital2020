package project.strategy;

public class PlayerSpellStrategy implements AttackStrategy {

    @Override
    public void execute(Player player, Monster monster) {
        System.out.println("You attacked the monster with your blizzard spell..");
        //Obtaining the monster's health after the player attack
        monster.setHp((monster.getHp()-player.getDmg()*randomPlayerFloat*2));
        System.out.println("Monster health:" + monster.getHp());
    }
}
