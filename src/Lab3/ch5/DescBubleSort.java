package Lab3.ch5;

public class DescBubleSort extends TemplateMethodBubleSort {
    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if(i1 > i2){
            return true;
        } else return false;
    }

    @Override
    void sort(Integer[] list) {
        DescSort(list);
    }
    private static void DescSort(Integer[] list){
        for(int i=0;i<list.length-1;i++){
            for(int j=0;j<list.length-i-1;j++){
                if(list[j] < list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
}
