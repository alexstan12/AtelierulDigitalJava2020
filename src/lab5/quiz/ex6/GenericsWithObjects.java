package lab5.quiz.ex6;

public class GenericsWithObjects<T> {
    Object obj;

    public GenericsWithObjects(Object obj) {
        this.obj = obj;
    }
    void print(){
        System.out.println(obj);
    }
}
