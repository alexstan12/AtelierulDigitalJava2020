package lab7.hardCodeCh1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Philosopher implements Runnable{
    private Chopstick cs1 ;
    private Chopstick cs2 ;

    public Philosopher(Chopstick cs1, Chopstick cs2) {
        this.cs1 = cs1;
        this.cs2 = cs2;
    }

    @Override
    public void run() {
        try {
            while (true) {
                doAction(System.nanoTime() + ": Thinking");
                synchronized (cs1) {
                    doAction(System.nanoTime() + ": Left chopstick picked");
                    synchronized (cs2){
                        doAction(System.nanoTime() + ": Right chopstick picked - now eating");
                        doAction(System.nanoTime() + ": Left chopstick put down");
                        doAction(System.nanoTime() + ": Right chopstick put down - now thinking");
                    }
                }
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    private void doAction(String action) throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + " " + action);
        Thread.sleep((int)(Math.random()*1000));
    }

}
