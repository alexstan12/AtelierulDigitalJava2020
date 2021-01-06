package lab7.ch3RPS;

public class Fight {
    private String winningChoice="";
    private Player winner;
   /* public Fight(String winner){
        this.winner = winner;
    }*/

    public void compete(Player competitor,String choice) throws DrawException{
        if(choice.equals(this.winningChoice)){
            throw new DrawException();
        }
        switch (this.winningChoice) {
            case "rock":
                if (choice.equals("paper")) {
                    this.winningChoice = choice;
                    this.winner = competitor;
                }
                break;
            case "paper":
                if (choice.equals("scissors")) {
                    this.winningChoice = choice;
                    this.winner = competitor;
                }
                break;
            case "scissors":
                if (choice.equals("rock")) {
                    this.winningChoice = choice;
                    this.winner = competitor;
                }
                break;
            default:
                this.winningChoice = choice;
                this.winner = competitor;
                break;
        }

    }

    public void displayWinner(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        if(this.winner !=null) {
            System.out.println("The winner is :" + this.winner.getName() + " with " + this.winningChoice);
        }
    }
}
