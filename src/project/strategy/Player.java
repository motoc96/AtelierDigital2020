package project.strategy;

public class Player  {
//Private members
    private float hp;
    private float dmg ;
    private AttackStrategy strategy;
//Constructor
    public Player(float hp, float dmg) {
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
    //A function which allows you to change the Attacking Strategy
    public void changeStrategy(AttackStrategy strategy){
        this.strategy=strategy;
    }
    //A function which calls the AttackStrategy method execute.
    public void attack(Player player,Monster monster){
        strategy.execute( player , monster);
    }
}
