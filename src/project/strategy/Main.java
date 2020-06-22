package project.strategy;

import java.util.Random;

//MonsterSlayer - Using Strategy Design Pattern

public class Main {
    public static void main(String[] args) {
        //Initialization
        System.out.println("A monster appeared in your way!");
        Player player = new Player(100,10);
        Monster monster = new Monster(100,10);

        //A while-do loop to see when the player or the monster reaches 0 health
        while(player.getHp() >= 0 || monster.getHp() >= 0) {
            //Creating a random number to select
            //which Attack Strategy player and monster will use
            Random rn = new Random();
            int i = rn.nextInt(3);
            switch (i){
                case 0:
                    player.changeStrategy(new PlayerMeleeStrategy());
                    player.attack(player,monster);
                    System.out.println();
                    break;
                case 1:
                    player.changeStrategy(new PlayerRangedStrategy());
                    player.attack(player,monster);
                    System.out.println();
                    break;
                case 2:
                    player.changeStrategy(new PlayerSpellStrategy());
                    player.attack(player,monster);
                    System.out.println();
                    break;
            }
            //After player's attack check if monster still have Health Points
            if(monster.getHp() <=0){
                System.out.println("You are victorious!!! Congratulations.");
                break;
            }
            switch (i){
                case 0:
                    monster.changeStrategy(new MonsterMeleeStrategy());
                    monster.attack(monster,player);
                    System.out.println();
                    break;
                case 1:
                    monster.changeStrategy(new MonsterSpellStrategy());
                    monster.attack(monster,player);
                    System.out.println();
                    break;
                case 2:
                    monster.changeStrategy(new MonsterRangedStrategy());
                    monster.attack(monster,player);
                    System.out.println();
                    break;
            }
            //Here it checks if a player has Health Points after the monster attack
            if(player.getHp() <= 0) {
                System.out.println("Monster won against your powers... Try again :(");
                break;
            }

        }
    }
}

