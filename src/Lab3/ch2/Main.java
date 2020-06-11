package Lab3.ch2;

import java.util.Arrays;

public class Main {
    public static void displaySorted(SortingStrategy strategy, Integer[] arr){
        strategy.sort(arr);
    }

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy1OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy2OfArr = Arrays.copyOf(arr,arr.length);

        displaySorted(new BubleSort(),copy1OfArr);
        displaySorted(new MergeSort(),copy2OfArr);

    }

}
