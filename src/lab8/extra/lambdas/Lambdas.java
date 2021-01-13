package lab8.extra.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Function<String, String> uppecaseName = name -> {
            if(name.isBlank()){
                throw new IllegalArgumentException("");
            }
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> uppercaseIf = (name,age) -> {
            if(name.isBlank()){
                throw new IllegalArgumentException("");
            }
            if(age <5) throw new IllegalArgumentException("too little");
            return name.toUpperCase();
        };

        String uppercasedName = uppercaseIf.apply("Alex", 24);
        System.out.println(uppercasedName);
    }
}
