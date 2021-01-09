package lab7.quiz.lec1;

public class ThreadDemo {
    public static int v = 0;
    public static void main(String[] args) {
        System.out.println("before: " + v);
        Object lock = new Object();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    v++;
                }
            }
        };
        for(int i=0; i<500; i++){
            (new Thread(runnable)).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after: " + v);
    }
}
