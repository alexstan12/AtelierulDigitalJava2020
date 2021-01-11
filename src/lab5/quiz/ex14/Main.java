package lab5.quiz.ex14;

public class Main {
    public static void main(String[] args) {
        Number[] ob = {1.2, 2.2, 3.2, 4.2, 5.2};
        StoreNumbers<Number> obj = new StoreNumbers<>(ob);
        print(obj);
    }
    static void print(StoreNumbers<?> c){
        for(int i=0; i<c.obj.length; i++){
            System.out.print(c.obj[i] + " ");
        }
    }
}
