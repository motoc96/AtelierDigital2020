package lab5.io.ch2;

import lab5.io.ch1.PhoneBook;

public class Main {
    public static void main(String[] args) {
        SecretMessage sm = new SecretMessage("./src/lab5/io/phoneBook.txt");
        System.out.println(sm);

    }
}
