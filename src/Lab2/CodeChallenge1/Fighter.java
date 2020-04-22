package Lab2.CodeChallenge1;

import java.util.Objects;

public class Fighter extends Human{

    private int damagePerAttack;

    public Fighter(int damagePerAttack,int health, String name) {
        super(name, health);
        this.damagePerAttack = damagePerAttack;
    }

    public int getDamagePerAttack(){
        return damagePerAttack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return damagePerAttack == fighter.damagePerAttack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(damagePerAttack);
    }
}
