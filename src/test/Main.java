package test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        String sortedT = Arrays.stream(t.split("")).sorted().collect(Collectors.joining());
        boolean letterFound = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sortedT.charAt(i)) {
                System.out.println(s.charAt(i));
                letterFound = true;
                break;
            }
        }

        if (letterFound == false) {
            System.out.println(sortedT.charAt(sortedT.length() - 1));
        }
    }
}