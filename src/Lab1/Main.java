package Lab1;
import CodeChallenge1.CC1;
import CodeChallenge2.CC2;

public class Main {

    private static int semester = 2;
    private int instanceVar = 3;

    public static void main(String[] args) {
      /*  int var = 2020;

        System.out.println("Atelierul digital " + var);
        System.out.println("First day " + semester);

        int a = 5;
        var = a>2?(a<4?10:8):7;
        System.out.println("var = "+ var);

        if(a>2) {
            if(a<4){
                var = 10;
            }else{
                var=8;
            }
        }else {
            var = 7;
        }
        System.out.println("var = "+ var);

        ControlFlow cf = new ControlFlow();
        System.out.println("result = " + cf.addManyTimes());
        int nr= 6;
        Integer nr2 = new Integer(4);
        cf.AutoBox(nr,nr2);*/

/*        CC1 fb = new CC1();
        fb.FizzBuzz();*/

        CC2 fbq = new CC2();
        var s = fbq.compute( 154);
        System.out.println(s);


        //stringExample();
    }

    public static void stringExample(){
        String s="Java ";
        s = s.concat("Code");
        System.out.println(s);
    }
}
