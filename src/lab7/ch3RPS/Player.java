package lab7.ch3RPS;

import java.util.Random;

public class Player extends Thread{
    private static final String[] options = {"rock", "paper", "scissors"};
    private Fight fight;

    public Player(Fight fight){
        this.fight = fight;
    }

    @Override
    public void run(){
        randomPick();
    }

    private void randomPick(){
        Random random = new Random();
        int selection = random.nextInt(Player.options.length);
        System.out.println(this.getName()+ " picked " + Player.options[selection]);
        try {
            synchronized (fight) {
                fight.compete(this, Player.options[selection]);
            }
        }catch (DrawException e){
            e.printStackTrace();
        }
    }
}
