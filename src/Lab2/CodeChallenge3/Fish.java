package Lab2.CodeChallenge3;

public class Fish extends Animal {

    protected Fish(int legs) {
        super(legs);
    }

    protected Fish(){
        this(0);
    }

    @Override
    void eat() {
        System.out.println("Fishy fishy eats...");
    }

    @Override
    protected void walk() {
        System.out.println("Can't walk, he swims.");
    }
}
