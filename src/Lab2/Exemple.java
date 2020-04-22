package Lab2;

public class Exemple {

    private int a = 3;

    public int getA(){
        return a;
    }

    public void setA(int a){
        this.a= a;
    }

    public int calculate(int b){
        int c;
        c = a + b;
        b++;
        return c;
    }

    public void incrementA(Exemple ex){
        ex.setA(10);
    }


}
