package lab7.quiz.ex9;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new TheThread(){
            public void run(){
                System.out.println(" foo");
            }
        };
        t.start();
    }
}
