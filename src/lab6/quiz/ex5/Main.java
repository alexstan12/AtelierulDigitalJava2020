package lab6.quiz.ex5;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");

        HashSet<String> subSet = new HashSet<>();
        subSet.add("E");
        subSet.add("B");
        subSet.add("A");
        subSet.add("F");
        hashSet.retainAll(subSet);
        System.out.println(hashSet);
    }
}
