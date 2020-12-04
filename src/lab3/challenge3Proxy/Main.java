package lab3.challenge3Proxy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Apartment ap01 = new Apartment("Crangasi01", 300);
        Apartment ap02 = new Apartment("Crangasi02", 600);
        Apartment ap03 = new Apartment("Crangasi03", 350);
        Apartment ap04 = new Apartment("Crangasi04", 400);
        Apartment ap05 = new Apartment("Crangasi05", 200);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(ap01);
        proxy.represent(ap02);
        proxy.represent(ap03);
        proxy.represent(ap04);
        proxy.represent(ap05);
        Apartment apForStudent01 = proxy.rent(student01);
        Apartment apForStudent02 = proxy.rent(student02);
        System.out.println(student01 + " rented " + apForStudent01);
        System.out.println(student02 + " rented " + apForStudent02);
    }
}
