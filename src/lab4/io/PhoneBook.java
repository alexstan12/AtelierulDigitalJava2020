package lab4.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    HashMap<String, Long> phoneNumbers = new HashMap<>();

    public PhoneBook(String phoneBook) {
        try {
            String name;
            long number;
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(phoneBook)));
            while(scanner.hasNext()){
                name = scanner.next();
                if(scanner.hasNextDouble()){
                    number = scanner.nextLong();
                    phoneNumbers.put(name, number);
                }
            }
        } catch (Exception e) {
            System.out.println("not found");
        }
    }
    public Long getByName(String name){
        return phoneNumbers.get(name);

    }
    public String toString(){
        return phoneNumbers.toString();
    }
}
