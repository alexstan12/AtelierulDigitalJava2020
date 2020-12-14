package lab4.challenge4LCD;

import java.io.*;
import java.util.Scanner;

public class Lcd {
    private String inputFile;
    private int height;
    private int width;
    public Lcd(String inputFile, int height, int width) {
        this.inputFile = inputFile;
        this.height = height;
        this.width = width;
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(inputFile)))) {
            String arg = new String();
            if(scanner.hasNext()){
                arg = scanner.nextLine();
            }
            int digitCount = arg.length();
            int[][][] chars = new int[digitCount][3][3];
            int[][] one = {{0, 0, 0}, {0, 0, 1}, {0, 0, 1}};
            int[][] two = {{0, 1, 0}, {0, 1, 1}, {1, 1, 0}};
            int[][] three = {{0, 1, 0}, {0, 1, 1}, {0, 1, 1}};
            int[][] four = {{0, 0, 0}, {1, 1, 1}, {0, 0, 1}};
            int[][] five = {{0, 1, 0}, {1, 1, 0}, {0, 1, 1}};
            int[][] six = {{0, 1, 0}, {1, 1, 0}, {1, 1, 1}};
            int[][] seven = {{0, 1, 0}, {1, 0, 0}, {1, 0, 0}};
            int[][] eight = {{0, 1, 0}, {1, 1, 1}, {1, 1, 1}};
            int[][] nine = {{0, 1, 0}, {1, 1, 1}, {0, 1, 1}};

            for (int i = 0; i < digitCount; i++) {
                if (arg.charAt(i) == '1') {
                    chars[i] = one;
                } else if (arg.charAt(i) == '2') {
                    chars[i] = two;
                } else if (arg.charAt(i) == '3') {
                    chars[i] = three;
                } else if (arg.charAt(i) == '4') {
                    chars[i] = four;
                } else if (arg.charAt(i) == '5') {
                    chars[i] = five;
                } else if (arg.charAt(i) == '6') {
                    chars[i] = six;
                } else if (arg.charAt(i) == '7') {
                    chars[i] = seven;
                } else if (arg.charAt(i) == '8') {
                    chars[i] = eight;
                } else chars[i] = nine;
            }
            try{
                File outputFile = new File("./src/lab4/challenge4LCD/output.txt");
                if(outputFile.createNewFile()){
                    System.out.println("Output file created: "+ outputFile.getName());
                }else{
                    System.out.println("File already exists : " + outputFile.getName());
                }
                BufferedWriter outputWriter = new BufferedWriter(new FileWriter(outputFile));
                for (int j = 0; j < 3; j++) { // no. of rows
                    if (j == 1) {
                        for (int t = 0; t < (height-1) / 2; t++) {
                            for (int i = 0; i < digitCount; i++) { // each specific digit
                                for (int k = 0; k < 3; k++) { // characters for each digit
                                    if (chars[i][j][k] == 0) {
                                        //System.out.print(" ");
                                        if(k==1){
                                            for (int w = 0; w < width - 1; w++) {
                                                outputWriter.write(" ");
                                                }
                                        }else{
                                            outputWriter.write(" ");
                                        }
                                    } else if (chars[i][j][k] == 1) {
                                        if (k == 1 && t==(height-1)/2-1) {
                                            for (int w = 0; w < width - 1; w++) {
                                                outputWriter.write("_");
                                            }
                                        }else if(k==1 && t!=(height-1)/2-1){
                                            for (int w = 0; w < width - 1; w++) {
                                                outputWriter.write(" ");
                                            }
                                        } else if(k!=1){
                                            outputWriter.write("|");
                                        }
                                        //System.out.print("|");
                                        //outputWriter.write("|");
                                    }
                                }
                                outputWriter.write(" ");
                            }
                            //System.out.print(" ");
                            outputWriter.newLine();
                        }
                    } else if (j == 2) {
                        for (int t = (height-1)/2; t < height-1; t++) {
                            for (int i = 0; i < digitCount; i++) { // each specific digit
                                for (int k = 0; k < 3; k++) { // characters for each digit
                                    if (chars[i][j][k] == 0) {
                                        //System.out.print(" ");
                                        if(k==1){
                                            for (int w = 0; w < width - 1; w++) {
                                                outputWriter.write(" ");
                                            }
                                        }else{
                                            outputWriter.write(" ");
                                        }
                                    } else if (chars[i][j][k] == 1) {
                                        if (k == 1 && t==height-1-1) {
                                            //System.out.print("_");
                                            for (int w = 0; w < width - 1; w++) {
                                                outputWriter.write("_");
                                            }
                                        }else if(k==1 && t!=height-1-1){
                                            for (int w = 0; w < width - 1; w++) {
                                                outputWriter.write(" ");
                                            }
                                        } else if(k!=1) outputWriter.write("|");
                                    }
                                }
                                //System.out.print(" ");
                                outputWriter.write(" ");
                            }
                            outputWriter.newLine();
                        }
                    }else{
                        for (int i = 0; i < digitCount; i++) { // each specific digit
                            for (int k = 0; k < 3; k++) { // characters for each digit
                                if (chars[i][j][k] == 0) {
                                    if (k == 1) {
                                        //System.out.print("_");
                                        for (int w = 0; w < width - 1; w++) {
                                            outputWriter.write(" ");
                                        }
                                    }else outputWriter.write(" ");
                                } else if (chars[i][j][k] == 1) {
                                    if (k == 1) {
                                        //System.out.print("_");
                                        for (int w = 0; w < width - 1; w++) {
                                            outputWriter.write("_");
                                        }
                                    }
                                }
                            }
                            //System.out.print(" ");
                            outputWriter.write(" ");
                        }
                        outputWriter.newLine();
                    }
                }
                outputWriter.flush();
                outputWriter.close();
            }catch (IOException e){
                System.out.println("Can not create file");
                e.printStackTrace();
            }
        }catch(IOException e){
        System.out.println("Can't open input file");
        e.printStackTrace();
        }
    }
}
