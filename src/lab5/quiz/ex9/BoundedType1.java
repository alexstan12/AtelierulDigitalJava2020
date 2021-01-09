package lab5.quiz.ex9;

public class BoundedType1<T extends Number> {
    double sum = 0.0;
    void addSum(T item){
        sum+= item.doubleValue();
    }
    double getSum(){
        return sum;
    }
}
