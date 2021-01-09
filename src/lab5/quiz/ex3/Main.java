package lab5.quiz.ex3;

public class Main<T> {
    private T t;
    public void set(T t){this.t = t;}
    public T get(){
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Main<Integer> integerBox = new Main<>();
        integerBox.set(10);
        integerBox.inspect(21);
    }
}
