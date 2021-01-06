package lab7.ch2BankTransactions;

public class BankAccount {
    private double debit;
    private String name;

    public BankAccount(int debit, String name){
        this.debit = debit;
        this.name = name;
    }

    public synchronized void withdraw(double amount) throws InsufficientFundsException{
        longDatabaseCall();
        if(debit >= amount){
            this.debit-=amount;
            System.out.println("New amount after withdraw in " + name + " :" + debit);
        }else{
            throw new InsufficientFundsException();
        }
    }

    public void deposit(double amount){
        longDatabaseCall();
        this.debit+=amount;
        System.out.println("New amount after deposit in " + name + " :" + debit);
    }

    private void longDatabaseCall(){
        try{
            Thread.sleep(100);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
