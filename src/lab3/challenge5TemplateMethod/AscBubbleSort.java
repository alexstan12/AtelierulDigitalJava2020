package lab3.challenge5TemplateMethod;

public class AscBubbleSort extends TemplateMethodBubbleSort {

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        Integer temp;
        if(i1>i2){
            return false;
        }else return true;

    }
}
