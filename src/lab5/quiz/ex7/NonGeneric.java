package lab5.quiz.ex7;

public class NonGeneric {
    Object ob;

    public NonGeneric(Object ob) {
        this.ob = ob;
    }

    void showType(){
        System.out.println("Type is : " + ob.getClass().getName());
    }
}
