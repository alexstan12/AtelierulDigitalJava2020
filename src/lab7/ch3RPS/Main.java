package lab7.ch3RPS;

public class Main {
    public static void main(String[] args) {
        Fight fight = new Fight();
        Player p1 = new Player(fight);
        Player p2 = new Player(fight);

        p1.start();
        p2.start();
        fight.displayWinner();
    }
}
