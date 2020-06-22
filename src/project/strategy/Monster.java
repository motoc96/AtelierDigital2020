package project.strategy;

    public class Monster {
//Private members
    private float hp ;
    private float dmg ;
    private AttackStrategy strategy;

//Constructor
    public Monster(float hp, float dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }
//Getters and setters
    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getDmg() {
        return dmg;
    }
//A function which calls the AttackStrategy method execute.
    public void attack(Monster monster,Player player){

        strategy.execute(player,monster);
    }
//A function which allows you to change the Attacking Strategy
    public void changeStrategy(AttackStrategy strategy){
        this.strategy=strategy;
    }

}
