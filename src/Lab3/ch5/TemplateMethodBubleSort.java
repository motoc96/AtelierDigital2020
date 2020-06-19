package Lab3.ch5;

public abstract class TemplateMethodBubleSort {
    void sort(Integer[] list){
            AscBubleSort asc = new AscBubleSort();
            DescBubleSort dsc = new DescBubleSort();
            if(asc.numbersInCorrectOrder(1,9)== true){
                asc.sort(list);
            } else if(dsc.numbersInCorrectOrder(9,1) == true){
                dsc.sort(list);
            }
    }
    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
