package lab7.ch3RPS;

public class DrawException extends Exception{
    public DrawException(){
        super("Draw, both players picked the same choice");
    }
}
