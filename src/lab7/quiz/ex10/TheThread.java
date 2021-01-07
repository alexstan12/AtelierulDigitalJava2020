package lab7.quiz.ex10;

public class TheThread extends Thread{
    private Runnable runnable;
    TheThread(){

    }
    TheThread(Runnable r){
        super(r);
        this.runnable = r;
    }

    public void run(){
        System.out.print("Inside Thread ");
        runnable.run();
    }
}
class RunnableDemo implements Runnable{
    public void run(){
        System.out.print(" Inside Runnable");
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        //new TheThread().start();
        new TheThread(new RunnableDemo()).start();
    }
}
