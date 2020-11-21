package lab1;

import java.util.Scanner;

public class Challenge2 {
    static String compute(int n){
        StringBuilder s= new StringBuilder();
        //Check if our number is divisible by the following:
        if(n%3 == 0){
            s.append("Foo");
        }
        if(n%5 == 0){
            s.append("Bar");
        }
        if(n%7 == 0){
            s.append("Qix");
        }
        String[] c =String.valueOf(n).split("");
        for (String value : c) {
            switch (value) {
                case "3":
                    s.append("Foo");
                    break;
                case "5":
                    s.append("Bar");
                    break;
                case "7":
                    s.append("Qix");
                    break;
            }
        }
        if(s.length() == 0) s = new StringBuilder(String.valueOf(n));
        return s.toString();
    }

    static String compute2(int n){
        String[] c1Res = compute(n).split("(?<=[a-z])(?=[A-Z])|(?=[0-9])"); // first function result
                                            // regex representing positive lookbehind and positive lookahead | digits
        int iterator = 0;
        if(n%3 == 0) iterator++;
        if(n%5 == 0) iterator++;
        if(n%7 == 0) iterator++;
        // counting with how many elements it is divisible
        String[] c =String.valueOf(n).split(""); // actual number, taken apart
        if(!c1Res[0].matches("[0-9]")) { // if the number was processed by compute1
            for (int i = 0; i <c.length; i++) {
                if (Integer.parseInt(c[i]) == 3 || Integer.parseInt(c[i]) == 5 || Integer.parseInt(c[i]) == 7){
                    iterator++;
                    continue;
                }
                if (Integer.parseInt(c[i]) == 0 ) {
                    if(iterator>0){
                        c1Res[iterator-1] += "*";
                    }else{
                        c1Res[iterator]+="*";
                    }
                }
            }
        }else if(iterator == 0) { // if the number wasn't processed by compute1
            for(int i=0; i< c.length; i++){
                if(c[i].equals("0")) {
                    iterator = i;
                    c1Res[iterator]="*";
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String c1Re : c1Res) {
            sb.append(c1Re);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println(compute(n));
        System.out.print(compute2(n));
    }
}
