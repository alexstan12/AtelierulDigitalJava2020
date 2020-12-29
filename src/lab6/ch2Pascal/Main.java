package lab6.ch2Pascal;

public class Main {
    public static void main(String[] args) {
        int rows = Integer.parseInt(args[0]);
        for(int i =0;i<rows;i++) {
            int number = 1;
            System.out.format("%"+(rows-i)*2+"s",""); // spaces to be printed before values
                                                // to ensure pyramidal shape
            for(int j=0;j<=i;j++) {
                System.out.format("%4d",number);
                number = number * (i - j) / (j + 1);

            }
            System.out.println();
        }

    }
}
