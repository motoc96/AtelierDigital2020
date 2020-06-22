package project.strategy;

public class PlayerMeleeStrategy implements AttackStrategy {


    @Override
    public void execute(Player player, Monster monster) {
        System.out.println("You attacked the monster with your fists..");;
        monster.setHp((monster.getHp()-player.getDmg()*randomPlayerFloat*2));
        System.out.println("Monster health:" + monster.getHp());
    }
}
