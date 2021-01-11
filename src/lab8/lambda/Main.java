package lab8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    static String ex1(){
        List<String> inputlist = Arrays.asList("Hello", "End","Long", "Light", "Other");
        StringBuilder sb = new StringBuilder();
        inputlist.forEach(s->sb.append(s.charAt(0)));
        return sb.toString();
    }

    static String ex2(){
        List<String> inputlist = new ArrayList<>(Arrays.asList("Hello", "End","Long", "Light", "Other"));
        inputlist.removeIf(s -> s.length()%2!=0);
        return inputlist.toString();
    }

    static void ex3(){
        List<String> inputlist = new ArrayList<>(Arrays.asList("Hello", "End","Long", "Light", "Other"));
        inputlist.replaceAll(String::toUpperCase);
        System.out.println(inputlist);

    }

    static void ex4(){
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "First");
        map.put("2", "Second");
        map.put("3", "Third");

        StringBuilder sb = new StringBuilder();

        map.forEach((key, value)-> sb.append(key).append(value));
        System.out.println(sb);

    }

    static void ex5(){
        List<Integer> inputlist = Arrays.asList(1,2,3,4,5);
        Thread t = new Thread(() -> inputlist.forEach(System.out::print));
        t.start();

    }

    public static void main(String[] args) {
        System.out.println(ex1());
        System.out.println(ex2());
        ex3();
        ex4();
        ex5();
    }
}
