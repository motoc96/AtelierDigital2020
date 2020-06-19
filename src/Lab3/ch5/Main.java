package Lab3.ch5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy1OfArr = Arrays.copyOf(arr,arr.length);
        Integer[] copy2OfArr = Arrays.copyOf(arr,arr.length);

        AscBubleSort asc = new AscBubleSort();
        asc.sort(copy1OfArr);
        DescBubleSort desc = new DescBubleSort();
        desc.sort(copy2OfArr);

        displaySorted(copy1OfArr);
        displaySorted(copy2OfArr);

    }
    public static void displaySorted(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
