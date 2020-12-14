package lab4.challenge3Anagram;

import java.io.*;
import java.util.Scanner;

public class Anagram {
    private String source = "listen";
    public Anagram(String text){
        try{
            File outputFile = new File("./src/lab4/challenge3Anagram/output.txt");
            if(outputFile.createNewFile()){
                System.out.println("File created: " + outputFile.getName());
            }else{
                System.out.println("File already exists");
            }
            try(BufferedWriter outputWriter = new BufferedWriter(new FileWriter(outputFile))) {
                Scanner scanner = new Scanner(new BufferedReader(new FileReader(text)));
                while (scanner.hasNext()) {
                    boolean isAnagram = true;
                    String line = scanner.nextLine();
                    if (line.length() == source.length()) {
                        for (int i = 0; i < source.length(); i++) {
                            if (line.contains(source.substring(i, i + 1))) {
                                continue;
                            } else {
                                isAnagram = false;
                                break;
                            }
                        }
                    } else isAnagram = false;
                    if (isAnagram == true) {
                        outputWriter.append(line);
                        outputWriter.newLine();
                    }
                }
                outputWriter.flush();
            }catch(IOException e){
                System.out.println("Can't write to file");
                e.printStackTrace();
            }
        }catch(IOException e){
            System.out.println("not found");
            e.printStackTrace();
        }


    }
}
