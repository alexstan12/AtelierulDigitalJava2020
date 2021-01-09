package lab5.quiz.ex7;

public class Main {
    public static void main(String[] args) {
        NonGeneric obj1 = new NonGeneric(88);
        obj1.showType();
        NonGeneric obj2 = new NonGeneric("MeritCampus");
        obj2.showType();
    }
}
