package lab7.quiz.ex9;

public class TheThread extends Thread{
    TheThread(){
        System.out.print(" The Thread");
    }

    public void run(){
        System.out.print(" bar");
    }

    public void run(String s){
        System.out.println(" baz");
    }
}

