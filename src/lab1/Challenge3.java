package lab1;

import java.util.Scanner;
import java.util.Vector;
public class Challenge3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        String[] sv = scanner.nextLine().split(","); //string array version of the vector
        //System.out.println(Arrays.toString(sv));
        int count = 0;
        for(int i=0; i< sv.length;i++){
            v.add(Integer.parseInt(sv[i]));
            //System.out.print(v.get(i) + " ");
        }
        for(int i=0; i<v.size();i++){
            for(int j=i+1;j<v.size();j++){
                    if(v.get(i)+v.get(j) == 0){
                        v.remove(j);
                        v.remove(i);
                        j=i;
                        count++;
                    }
            }
        }
        System.out.println(count);
    }

}
