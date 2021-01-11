package lab5.quiz.ex14;

public class StoreNumbers<T extends Number> {
    T[] obj;

    public StoreNumbers(T[] obj) {
        this.obj = obj;
    }
}
