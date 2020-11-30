package lab3.Delegation;

public class Employee {
    private String name;
    public void work(){
        System.out.println("Working");
    };

    public void calculatePay(PayCalculator p){
        System.out.println("Rest to pay: "+ p.calculate(name));
    };
}
