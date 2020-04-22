package Lab2.CodeChallenge1;

public class Human {

    private String name;
    private int health;

    public Human(String name, int health){
        this.health = health;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void decreaseHealth(int damage){
        health=health-damage;
    }
}
