package Lab2.CodeChallenge3;

public class Spider extends Animal{

    protected Spider(int legs) {
        super(legs);
    }

    @Override
    void eat() {
        System.out.println("Spider eats...");
    }
}
