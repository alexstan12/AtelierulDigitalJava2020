package lab5.quiz.ex6;

public class Main {
    public static void main(String[] args) {
        GenericsWithObjects<Double> doubleObject = new GenericsWithObjects<>(12.0);
        doubleObject.print();
        GenericsWithObjects<String> stringObject = new GenericsWithObjects<>("MC");
        stringObject.print();
    }
}
