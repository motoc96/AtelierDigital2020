package Lab1.CodeChallenge2;

public class CC2 {
private String result=" ";
private int[] vector= new int[10];
private int count = 0;
private boolean isDivisible = false;

    public String compute(int num){

            if (num % 3 == 0) {
                result = result.concat("Foo");
                isDivisible = true;
            }

            if (num % 5 == 0) {
                result = result.concat("Bar");
                isDivisible = true;
            }

            if (num % 7 == 0) {
                result = result.concat("Qix");
                isDivisible = true;
            }

        while(num != 0){
            count++;
            vector[count] = num % 10;
            num = num / 10;
//            System.out.println(vector[count]);
//            System.out.println(count);
        }

        for(int i =count;i>0;i--) {
            if (isDivisible == true) {
                if (vector[i] == 7) {
                    result = result.concat("Qix");

                } else if (vector[i] == 5) {
                    result = result.concat("Bar");

                } else if (vector[i] == 3) {
                    result = result.concat("Foo");

                } else if (vector[i] == 0) {
                    result = result.concat("*");

                }
            } else
                if (vector[i] == 0) {
                    result = result.concat("*");
                } else result = result.concat(String.valueOf(vector[i]));
            }


        return result;
    }

}
