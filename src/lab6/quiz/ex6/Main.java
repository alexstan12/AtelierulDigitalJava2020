package lab6.quiz.ex6;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add("Roots");
        tree.add("Stem");
        tree.add("Branch");
        tree.add("Leaves");
        tree.remove("fruits");
        System.out.println("Elements are : " +tree);
    }
}
