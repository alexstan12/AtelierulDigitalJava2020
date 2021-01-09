package lab5.quiz.ex4;

public class GenericsWithObjects<T> {
    T obj;

    public GenericsWithObjects(T obj) {
        this.obj = obj;
    }
    void print(){
        System.out.println(obj);
    }
}
