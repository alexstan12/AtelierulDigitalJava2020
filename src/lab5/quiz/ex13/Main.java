package lab5.quiz.ex13;

public class Main {
    public static void main(String[] args) {
        GenericsErasure<Integer> integerObject = new GenericsErasure<>(12);
        System.out.println(integerObject.getClass().getName());
    }
}
