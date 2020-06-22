package project.strategy;

public class Monster {
    private float hp ;
    private float dmg ;
    private AttackStrategy strategy;


    public Monster(float hp, float dmg) {
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

    public void attack(Monster monster,Player player){

        strategy.execute(player,monster);
    }
    public void changeStrategy(AttackStrategy strategy){
        this.strategy=strategy;
    }

}
