package lab5.quiz.ex1;

public class Main {
    public static void main(String[] args) {
        MyGen<Integer> m = new MyGen<>();
        m.set(1);
        System.out.println(m.get());
    }
}
