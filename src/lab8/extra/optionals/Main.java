package lab8.extra.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hi")
                .orElseThrow(()-> new IllegalStateException("bla bla"));
        Optional.ofNullable("john@gmail.com")
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        ()->{
                            System.out.println("Can't send email");
                        });

        System.out.println(value);
    }
}
