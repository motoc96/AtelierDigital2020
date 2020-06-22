package project.strategy;

import java.util.Random;

public interface AttackStrategy {
    void execute(Player player,Monster monster);
    //Creating two random numbers used for player and monster attacks
    Random rn1 = new Random();
    Random rn2 = new Random();
    float randomPlayerFloat = rn1.nextFloat();
    float randomMonsterFloat = rn2.nextFloat();
}
