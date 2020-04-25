package Lab2.CodeChallenge3;

public class Main {
    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat(4,"Fluffy");
        Animal a = new Spider(8);
        Animal f = new Fish();
        Pet p = new Cat();

        d.eat();
        d.walk();

        c.eat();
        c.play();
        c.walk();
        System.out.println(c.getName());
        c.setName("Fofo");
        System.out.println(c.getName());

        a.eat();
        a.walk();

        f.eat();
        f.walk();

        p.eat();
        p.play();
        p.walk();

    }
}
