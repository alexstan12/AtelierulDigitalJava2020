package lab5.quiz.ex8;

public class Average<T extends Number> {
    T[] numbers;

    public Average(T[] numbers) {
        this.numbers = numbers;
    }
    double getAverage(){
        double sum = 0.0;
        for(int i=0; i< numbers.length; i++){
            sum+= numbers[i].doubleValue();
        }
        return sum/ numbers.length;
    }

    boolean sameAverage(Average<T> obj){
        return (getAverage() == obj.getAverage());
    }
}
