package lab7.quiz.ex6;

public class ThreadDemo implements Runnable{
    String x,y;
    int count = 0;

    public void run(){
        for(int i=0; i<10; i++)
            synchronized (this){
            x = "Hello";
            y = "Java";
            count++;
                System.out.println(Thread.currentThread().getName()+ ", count " +count +": " +x + " " + y + " ");
            }
    }

    public static void main(String[] args) {
        ThreadDemo run = new ThreadDemo();
        Thread obj1 = new Thread(run);
        Thread obj2 = new Thread(run);
        obj1.start();
        obj2.start();
    }
}
