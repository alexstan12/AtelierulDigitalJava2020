package lab7.quiz.ex1;

public class ThreadDemo extends Thread{
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        t.start();
        System.out.print("one. ");
        t.start();
        System.out.print("two. ");
    }
    @Override
    public void run(){
        System.out.print("Thread ");
    }
}
