package lab5.exception;

public class Main {
    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        try{

            sc.metchodUncheckedException(2);
            sc.metchodUncheckedException(0);

            sc.methodCheckedException(2);
        } catch(ChException exception){
            exception.printStackTrace();
        }finally {
            System.out.println("Finally");
        }
        System.out.println("After exception.");

    }
}
