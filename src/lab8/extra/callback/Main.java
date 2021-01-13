package lab8.extra.callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Alex", null, value->{
            System.out.println("Last name not provided for " +
                    value);
        });
        hello("Mara", null, ()-> System.out.println("No last name provided"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName!=null) System.out.println(lastName);
            else{
                callback.accept(firstName);
        }
    }

    static void hello(String firstName, String lastName, Runnable runnable){
        System.out.println(firstName);
        if(lastName!=null) System.out.println(lastName);
        else{
            runnable.run();
        }
    }

}
