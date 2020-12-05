package lab3.challenge5TemplateMethod;

public abstract class TemplateMethodBubbleSort {
    void sort(Integer[] list){
        for(int i=0; i<list.length-1; i++) {
            Integer temp;
            for (int j = 0; j < list.length-i-1; j++) {
               if(numbersInCorrectOrder(list[j],list[j+1])){
                   temp = list[j];
                   list[j] = list[j+1];
                   list[j+1] = temp;
               }
            }
        }
    };
    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
