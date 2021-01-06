package lab7.ch2BankTransactions;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(2000, "ba1");
        BankAccount ba2 = new BankAccount(4000, "ba2");
        BankAccount ba3 = new BankAccount(2500, "ba3");

        TransactionThread tt1 = new TransactionThread("t1", ba1, ba2, 2000);
        TransactionThread tt2 = new TransactionThread("t1", ba1, ba3, 300);
        // ba1 is a shared monitor object between the 2 threads
        tt1.start();
        tt2.start();
    }
}
