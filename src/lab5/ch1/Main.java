package lab5.ch1;

public class Main {
    public static void main(String[] args) {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        RON ron = new RON(10);

        USD usd = exchangeDesk.convert(ron,USD.class,0.225);
        System.out.println(usd);

        EUR eur = exchangeDesk.convert(usd,EUR.class,1.1);
        System.out.println(eur);
    }
}
