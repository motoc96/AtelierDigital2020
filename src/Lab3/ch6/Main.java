package Lab3.ch6;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jhon");
        Person person1 = new Builder("Eddy").setJob("Police Officer")
                .setUniversity("LAPDS").setDrivingLicense(1234).setIsMarried(true).build();
        System.out.println(person);
    }
}
