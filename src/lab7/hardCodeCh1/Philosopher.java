package lab7.hardCodeCh1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Philosopher implements Runnable{
    private Chopstick cs1 = null;
    private Chopstick cs2 = null;
    private Chopstick[] chopsticksArr;

    public Philosopher(Chopstick[] chopsticksArr) {
        this.chopsticksArr = chopsticksArr;
    }

    @Override
    public void run() {
        grabSticks();
    }

    private synchronized void eat(){
        if(this.cs1!=null && this.cs2!=null){
            System.out.println(Thread.currentThread().getName() + " is eating");
        }
    }

    private void grabSticks(){
        int i=0;
        while(i<chopsticksArr.length) {
            Lock lock = new ReentrantLock();
            if (lock.tryLock()) {

                try {
                    this.cs1 = chopsticksArr[i];
                    if(i+1<chopsticksArr.length){
                        i++;
                    }else{
                        i=0;
                    }
                    this.cs2 = chopsticksArr[i];
                    eat();

                } finally {
                    lock.unlock();
                    try {
                        Thread.currentThread().sleep(3000);
                        System.out.println("================");
                    }catch (InterruptedException e ){
                        e.printStackTrace();
                    }
                }
            } else {
                i++;
                }
        }

        }

}
