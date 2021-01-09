package lab5.quiz.ex2;

public class Main {
    public static void main(String[] args) {
        B<C> b = new B();
        C c = b.process(new C());
        B<C> b2 = new B<>();
        C c2 = b2.process(new C());

    }
}
    interface A{
        int count();
        void show();
    }
    class B<T extends A>{
        T process(T t){
            t.count();
            t.show();
            return t;
        }
    }
    class C implements A{
        public int count(){ return 25;}
        public void show(){
            System.out.print("Class C");
        }
    }

