package Lab2.CodeChallenge1;

public class Main {
    public static void main(String[] args) {

        Fighter f1= new Fighter(10,100,"Dark Fighter");
        Fighter f2 = new Fighter(12,105,"Angel Fighter");
        Fighter f3= new Fighter(10,100,"Dark Fighter");

        BoxingMatch bm = new BoxingMatch(f1,f2);
        System.out.println("f1 vs f2 =" + bm.fight());
    }
}

