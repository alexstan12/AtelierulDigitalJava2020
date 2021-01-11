package lab5.quiz.ex12;

public class A<T> {
    T ob;

    public A(T ob) {
        this.ob = ob;
    }
    public void print(T ob){
        System.out.println("Obj = " + ob);
    }
}
