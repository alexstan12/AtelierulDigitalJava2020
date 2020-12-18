package lab5.ch2;

public class ColorsDoNotMatchException extends Exception {
    public ColorsDoNotMatchException() {
        super("Wrong matching colors");
    }
}
