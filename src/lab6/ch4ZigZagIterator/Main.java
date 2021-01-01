package lab6.ch4ZigZagIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        boolean sign = true; // to detect sign state
        for(String arg:args){
            myList.add(Integer.parseInt(arg));
        }
        Iterator<Integer> it = myList.iterator();
        Integer x;
        Integer n = 0;

        while(it.hasNext()) {
            //Integer x = it.next();
            x = it.next();
            if (it.hasNext()) n = it.next();

            if (sign == true) {
                if (x < n) newList.add(x);
                else newList.add(n);
                sign = false;
            } else {
                if (x > n) newList.add(x);
                else newList.add(n);
                sign = true;
            }
        }
        System.out.println(newList);
    }
}
