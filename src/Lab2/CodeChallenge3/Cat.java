package Lab2.CodeChallenge3;

public class Cat extends Animal implements Pet{
    String name;

    protected Cat(){
        this(4," ");
    }

    protected Cat(int legs, String name) {
        super(legs);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name= name;
    }

    @Override
    public void play() {
        System.out.println("The cat is playing...");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking...");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }
}
