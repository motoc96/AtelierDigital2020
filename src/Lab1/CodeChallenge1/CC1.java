package Lab1.CodeChallenge1;

public class CC1 {

    public void FizzBuzz(){

        for(int i = 0;i<100;i++){

            if(i%3 == 0 && i%5 == 0){

                System.out.println("FizzBuzz");

            }else if(i%11==0){

                System.out.println("Jazz");

            }else if(i%7==0){

                System.out.println("Rizz");

            }else if(i%5==0){

                System.out.println("Buzz");

            }else if(i%3==0){

                System.out.println("Fizz");

            }else{

                System.out.println(i);

            }

        }

    }

}
