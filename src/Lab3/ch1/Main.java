package Lab3.ch1;


// Implement the iterator pattern for an integer array. The iterator class should
// be named ArrayCustomIterator and should have 2 methods:
// boolean hasNext(); int Next();
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
