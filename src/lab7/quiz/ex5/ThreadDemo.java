package lab7.quiz.ex5;

public class ThreadDemo implements Runnable{
    int x=0, y=0;
    int addX(){
        x++;
        return x;
    }

    int addY(){
        y++;
        return y;
    }
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + ": " + addX()+ " "+ addY());
        }
    }

    public static void main(String[] args) {
        ThreadDemo obj1 = new ThreadDemo();
        ThreadDemo obj2 = new ThreadDemo();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
