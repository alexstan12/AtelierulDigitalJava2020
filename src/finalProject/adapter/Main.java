package finalProject.adapter;

public class Main {
    public static void main(String[] args) {

        DanceClub danceClub = new DanceClub(18);
        System.out.println(danceClub);
        System.out.println("--------------------------");
        Adult adult1 = new Adult(24, "Mike");
        System.out.println("Is " + adult1.getName() + " old enough: "
                        + danceClub.isCustomerOldEnough(adult1));

        // DanceClub does not accept an object of Teenager class
        // , but we have an adapter for this
        Teenager teenager1 = new Teenager(14, "Eddie");

        // does not compile
        /*System.out.println(("Is " + teenager1.getName() + "old enough:"
                + danceClub.isCustomerOldEnough(teenager1));*/

        TeenagerToAdultAdapter adapter1 = new TeenagerToAdultAdapter(teenager1);
        System.out.println("Is " + adapter1.getName() + " old enough: "
                + danceClub.isCustomerOldEnough(adapter1));
    }
}
