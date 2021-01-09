package lab5.quiz.ex8;

public class Main {
    public static void main(String[] args) {
        Integer[] integerNumbers = {1,2,3,4};
        Double[] doubleNumbers = {1.0,2.0, 3.0, 4.0};
        Average<Integer> integerObject = new Average<>(integerNumbers);
        Average<Double> doubleObject = new Average<>(doubleNumbers);
        //System.out.println(integerObject.sameAverage(doubleObject));
    }
}
