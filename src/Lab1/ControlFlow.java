package Lab1;

public class ControlFlow {

    private int times=10;

    public int addManyTimes(){

        int result = 3;
//        while(times>0){
//            result++;
//            times--;
        //       }

        for(int i=0;i<times;i++){
            result++;
        }

        return result;
    }

    public void AutoBox(Integer i, int j){
        System.out.println("i= "+ i);
        System.out.println("j= "+ j);
    }

}
// In Stack se memoreaza primitivele si in Heap se memoreaza obiectele
