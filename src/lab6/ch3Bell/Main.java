package lab6.ch3Bell;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int number = 1;
        List<List<String>> listOfLists = new ArrayList<List<String>>(size);
        for(int i=0; i<size; i++) {
            listOfLists.add(new ArrayList<String>());
        }
        for(int i=0; i<size; i++) {
            /*for (int j = 0; j < size - i-1; j++) {
                listOfLists.get(i).add(" ");
            }*/
            if(i==0){
                listOfLists.get(i).add(String.valueOf(number));
            }else {
                listOfLists.get(i).add(String.valueOf(number));
                //for (int j = (size - i); j <= size - 1; j++) {
                for (int j = 1; j <= i; j++) {
                    number = number + Integer.parseInt(listOfLists.get(i - 1).get(j-1));
                    listOfLists.get(i).add(String.valueOf(number));
                }
            }
        }
        for(int row=0; row<listOfLists.size();row++){
            System.out.format("%"+(size- row)*2+"s",""); // spaces to be printed before values
            // to ensure pyramidal shape
            for(int elem=0; elem<listOfLists.get(row).size();elem++){
                System.out.format("%4s", listOfLists.get(row).get(elem));
            }
            System.out.println();
        }
    }
}
