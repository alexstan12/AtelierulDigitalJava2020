package lab6.quiz.ex4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(11,"a");
        Collections.unmodifiableMap(hashMap);
        hashMap.put(12,"b");
        System.out.println(hashMap);
    }
}
