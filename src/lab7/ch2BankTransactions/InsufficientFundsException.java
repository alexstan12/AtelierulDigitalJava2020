package lab7.ch2BankTransactions;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Not enough money");
    }
}
