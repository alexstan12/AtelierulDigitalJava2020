package lab6.quiz.ex7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("GeeksforGeeks");
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.printf(iter.next() + " ");
        }
    }
}
