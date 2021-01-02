package lab6.ch6MatrixSpiral;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter square matrix length: ");
        int n = scanner.nextInt();
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        for(int i=0; i<n; i++){
            matrix.add(new ArrayList<Integer>());
        }
        for(int i=0; i<n; i++){
            System.out.print("Enter line " + (i+1) +": ");
            for(int j=0; j<n; j++){
                Integer e = scanner.nextInt();
                matrix.get(i).add(e);
            }
        }
        int L_end = n-1;
        int l_end =n-1;
        int L_begin = 0;
        int l_begin = 0;
        while(l_end>=l_begin && L_end>=L_begin){
            for(int i=l_begin; i<=l_end; i++){
                System.out.print(matrix.get(L_begin).get(i) + " ");
            }
            for(int i=L_begin+1; i<=L_end; i++){
                System.out.print(matrix.get(i).get(l_end) + " ");
            }
            for(int i=l_end-1; i>=l_begin;i--){
                System.out.print(matrix.get(L_end).get(i) + " ");
            }
            for(int i=L_end-1; i>=L_begin+1;i--){
                System.out.print(matrix.get(i).get(l_begin) + " ");
            }
            l_begin++;
            l_end--;
            L_begin++;
            L_end--;
        }
    }
}
