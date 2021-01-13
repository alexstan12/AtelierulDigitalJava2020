package lab8.extra.combinatorpattern;

import java.time.LocalDate;

import static lab8.extra.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice",
                "alice@gmail.com",
                "+08987123456",
                LocalDate.of(2000,1,1));
        System.out.println(new CustomerValidatorService().isValid(customer));

        //We can store customer in DB, if valid
        //Using combinator pattern
        ValidationResult result = isPhoneNumberValid()
                .and(isEmailValid())
                .and(isAdult())
                .apply(customer);
        System.out.println(result);

        if(result!= ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
