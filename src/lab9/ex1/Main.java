package lab9.ex1;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int factor = 2;
        IntStream s= IntStream.range(1,10).map(e-> e * factor).filter(e->e>5);
        int first = s.findFirst().getAsInt();
        System.out.println(first);
    }
}
