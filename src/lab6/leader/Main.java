package lab6.leader;
import java.util.*;

public class Main {
    public static void displayLeader(List<Integer> list){
        Collections.reverse(list);
        Iterator<Integer> it = list.iterator();
        Integer currentElement = list.get(0);
        System.out.println(currentElement + " ");
        Integer max = null;
        while(it.hasNext()){
            currentElement = it.next();
            if(currentElement > max){
                System.out.println(currentElement + " ");
                max = currentElement;
            }

        }
    }
    public static void main(String[] args) {
        displayLeader(Arrays.asList(1,5,11,2,9,7,2,5,4,1));
    }
}
