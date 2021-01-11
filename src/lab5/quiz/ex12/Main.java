package lab5.quiz.ex12;

public class Main {
    public static void main(String[] args) {
        A<Integer> b = new A(20);
        int sum = 10;
        sum+= b.ob;
        b.print(b.ob);
        System.out.println("Sum = " +sum);
    }
}
