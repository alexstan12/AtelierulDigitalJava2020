package lab1;

import java.util.Scanner;
import java.util.Vector;
public class Challenge4 {
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
                for(int k=j+1;k<v.size();k++){
                    if(v.get(i)+v.get(j)+v.get(k) == 0){
                        v.remove(k);
                        v.remove(j);
                        v.remove(i);
                        k=j;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
