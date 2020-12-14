package lab4.challenge2SecretMessage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMessage {
    private String secretMessage="";

    public SecretMessage(String text){
        try{
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(text)));
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                for(int i=0; i<line.length(); i++){
                    if(line.charAt(i) == 'X'){ secretMessage+=" ";
                                               continue;}
                    if(line.charAt(i) >='A' && line.charAt(i)<='Z') secretMessage+=line.charAt(i);
                }
            }
        }catch(Exception e){
            System.out.println("not found");
        }
    }

    @Override
    public String toString() {
        return "SecretMessage{" +
                "secretMessage='" + secretMessage + '\'' +
                '}';
    }
}
