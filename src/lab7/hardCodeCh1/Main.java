package lab7.hardCodeCh1;

public class Main {
    public static void main(String[] args) {
        Chopstick[] chopsticks = new Chopstick[5];
        for(int i=0; i<chopsticks.length; i++){
            chopsticks[i] = new Chopstick();
        }
        Thread[] philosophers = new Thread[5];
        for(int i=0; i< philosophers.length; i++){
            Chopstick cs1 = chopsticks[i];
            Chopstick cs2 = chopsticks[(i+1)% chopsticks.length];
            if(i== philosophers.length -1) {
                philosophers[i] = new Thread(new Philosopher(cs2, cs1), "Philosopher " + (i + 1));
            }else{
                philosophers[i] = new Thread(new Philosopher(cs1, cs2), "Philosopher " + (i + 1));

            }
            philosophers[i].start();
        }
    }
}
