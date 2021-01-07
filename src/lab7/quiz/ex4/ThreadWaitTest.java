package lab7.quiz.ex4;

public class ThreadWaitTest {
    public static void main(String[] args) {
        System.out.print("1 ");
        synchronized (args){
            System.out.print("2 ");
            try{
                args.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.print("3 ");
    }
}
