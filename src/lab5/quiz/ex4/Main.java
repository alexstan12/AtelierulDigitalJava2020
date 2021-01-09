package lab5.quiz.ex4;

public class Main {
    public static void main(String[] args) {
        GenericsWithObjects<Double> doubleObject = new GenericsWithObjects<>(12.0);
        doubleObject.print();
    }
}
