package project.strategy;

public class Player  {
    private float hp;
    private float dmg ;

    private AttackStrategy strategy;

    public Player(float hp, float dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getDmg() {
        return dmg;
    }

    public void changeStrategy(AttackStrategy strategy){
        this.strategy=strategy;
    }

    public void attack(Player player,Monster monster){
        strategy.execute( player , monster);
    }
}
