package lab5.io.ch1;

public class Main{
    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook("./src/lab5/io/phoneBook.txt");
        System.out.println(pb);

        System.out.println(pb.getNumberByName("Andrei"));

    }
}
