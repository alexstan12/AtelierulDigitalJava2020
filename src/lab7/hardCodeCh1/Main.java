package lab7.hardCodeCh1;

public class Main {
    public static void main(String[] args) {
        Chopstick[] chopsticks = new Chopstick[5];
        for(int i=0; i<chopsticks.length; i++){
            chopsticks[i] = new Chopstick();
        }
        Thread[] philosophers = new Thread[5];
        for(int i=0; i< philosophers.length; i++){
            philosophers[i] = new Thread(new Philosopher(chopsticks));
        }

        for(int i=0; i< philosophers.length; i++){
            philosophers[i].start();
        }
    }
}
