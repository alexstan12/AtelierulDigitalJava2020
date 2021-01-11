package lab5.quiz.ex10;

public class Main {
    public static void main(String[] args) {
        String str = "ABCD";
        printString(10);
        printString(str);

    }
    public static <E> void printString(Integer str){
        System.out.println("Integer = " + str);
    }
    public static <E> void printString(E str){
        System.out.println("String = " + str);
    }
}
