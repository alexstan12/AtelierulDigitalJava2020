package lab8.extra.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function - takes 1 arg and produces 1 result
        int increment = incrementByOne(0);
        System.out.println(increment);

       Integer increment2 =  incrementByOneFunction.apply(1);
        System.out.println(increment2);
        Function<Integer, Integer> addBy1ThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(addBy1ThenMultiplyBy10.apply(1));

        //BiFunction - takes 2 args and produces 1 result
        Integer biFunctionRes = incrementByOneAndMultiplyBiFunction.apply(2, 10);
        System.out.println(biFunctionRes);
    }

    static Function<Integer, Integer> incrementByOneFunction = number-> number++;
    static Function<Integer, Integer> multiplyBy10 = number -> number*10;

    static int incrementByOne(int number){
        return number+1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyby){
        return (number+1) * numToMultiplyby;
    }
}
