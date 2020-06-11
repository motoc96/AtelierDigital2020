package Lab3.ch2;

public class BubleSort implements SortingStrategy{

    @Override

    public void sort(Integer[] list) {
        BubbleSort(list);

        for(int i=0;i<list.length;++i){
            System.out.println(list[i]+ " ");
        }
        System.out.println();
    }
    private static void BubbleSort(Integer[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
