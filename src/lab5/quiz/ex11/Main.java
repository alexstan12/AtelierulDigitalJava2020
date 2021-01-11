package lab5.quiz.ex11;

public class Main<MC> {
    private MC t;

    public static void main(String[] args) {
        Main<String> type = new Main<>();
        type.set("A");
        Main type1 = new Main();
        type1.set("B");
        type1.set(10);
    }
    public MC get(){
        return this.t;
    }

    public void set(MC t1) {
        this.t = t1;
    }
}
