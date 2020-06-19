package lab5.ch2;

public class Main {
    public static void main(String[] args) {
        Running rl = new Running(21,"RED");
        Running rr = new Running(21,"RED");

        Heels hl = new Heels(20,"Black");
        Heels hr = new Heels(20,"Black");

        try {
            Pair<Running> runningPair = new Pair<Running>(rl,rr);
            Pair<Heels> heelsPair = new Pair<Heels>(hl,hr);
            System.out.println(runningPair);
            System.out.println(heelsPair);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
