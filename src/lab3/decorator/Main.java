package lab3.decorator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Beverage bv1 = new DarkRoast();
        bv1 = new Milk(bv1);
        bv1 = new Chocolate(bv1);
        bv1 = new Whip(bv1);

        System.out.println("cost = " + bv1.getCost());
        System.out.println("description = " + bv1.getDescription());

        Beverage bv2 =new Caffe();
        bv2 = new Milk(bv2);

        System.out.println("cost = " + bv2.getCost());
        System.out.println("description = " + bv2.getDescription());
    }
}
