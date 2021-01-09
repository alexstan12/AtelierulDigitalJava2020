package lab5.quiz.ex9;

public class Main {
    public static void main(String[] args) {
        BoundedType1<Integer> obj1 = new BoundedType1<>();
        obj1.addSum(5);
        obj1.addSum(11);
        System.out.println("Value 2 :" + obj1.getSum());
        BoundedType1<Float> obj2 = new BoundedType1<>();
        obj2.addSum(18F);
        obj2.addSum(12F);
        System.out.println("Value 1 :" + obj2.getSum());
    }
}
