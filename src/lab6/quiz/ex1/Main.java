package lab6.quiz.ex1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> s = new HashMap<>();
        s.put("1", "one");
        s.put("3","three");
        s.put("2","two");
        s.put("4","four");
        s.put("6","six");
        System.out.println(s);
    }
}
