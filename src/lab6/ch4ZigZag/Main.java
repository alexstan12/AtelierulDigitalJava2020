package lab6.ch4ZigZag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        boolean sign = true; // to detect sign state
        for(String arg:args){
            myList.add(Integer.parseInt(arg));
        }
        int pos = 0;
        if(myList.get(pos) > myList.get(pos+1)){
            Integer temp = myList.get(pos);
            myList.set(pos, myList.get(pos+1));
            myList.set(pos+1, temp);
        }
        pos++;
        while(pos < myList.size()-1){
            if(sign == true){
                if(myList.get(pos) < myList.get(pos+1)){
                    Integer temp = myList.get(pos);
                    myList.set(pos, myList.get(pos+1));
                    myList.set(pos+1, temp);
                }
                pos++;
                sign = false;
            }else{
                if(myList.get(pos) > myList.get(pos+1)){
                    Integer temp = myList.get(pos);
                    myList.set(pos, myList.get(pos+1));
                    myList.set(pos+1, temp);
                }
                pos++;
                sign = true;
            }
        }
        System.out.println(myList);
    }
}
