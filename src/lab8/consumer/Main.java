package lab8.consumer;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    @Test
    public static void ex1(){
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Consumer<List<String>> consumer = list1 ->list1.clear();
        consumer.accept(list);
        System.out.println(list);

        Assert.assertEquals(list, new ArrayList<>());
    }

    @Test
    public static void ex2(){
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "c", "first", "second"));

        Consumer<List<String>> consumer1 = list->list.add("first");
        Consumer<List<String>> consumer2 = list->list.add("second");

        Consumer<List<String>> consumer3 = consumer1.andThen(consumer2);
        consumer3.accept(list1);

        Assert.assertEquals(list1, list2);

    }

    public static void main(String[] args) {
        ex1();
    }
}
