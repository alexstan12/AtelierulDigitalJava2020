package finalProject.builderAndCommand;

import java.util.Scanner;

class Client {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /**
         * Controller of the Command pattern - it makes all the calls to specific commands
         * while abstracting all the logic from its client
         */
        Controller controller = new Controller();
        //System.out.println("Enter TV diagonal :");
        System.out.println("Enter the setup for your new TV:");
        System.out.print("Diagonal: ");
        String diagonal = scanner.next();
        System.out.print("Resolution: ");
        String resolution = scanner.next();
        System.out.print("Should it have internet connection capacity (true|false): ");
        boolean internetConnection = scanner.nextBoolean();
        System.out.print("Should it be a smart TV (true|false): ");
        boolean isSmart = scanner.nextBoolean();
        /**
         * the following represents the implementation of the Builder pattern
         */
        TV tv = new TV.TVBuilder()
                .setDiagonal(diagonal)
                .setResolution(resolution)
                .setInternetConnection(internetConnection)
                .setSmartFunctions(isSmart)
                .build();
        System.out.println("TV successfully built !");


        int[] channelList = new int[3];

        System.out.println("Please enter the channel numbers you wish to access: ");
        for (int i = 0; i < 3; i++) {
            channelList[i] = scanner.nextInt();
        }
        // concrete command
        Command turnOnTV = new TurnOnCommand(tv);
        controller.setCommand(turnOnTV);
        controller.executeCommand();
        // concrete command
        Command changeChannel;
        for (int i = 0; i < 3; i++) {
            /* write your code here */
            changeChannel = new ChangeChannelCommand(new Channel(tv, channelList[i]));
            controller.setCommand(changeChannel);
            controller.executeCommand();
        }
        // concrete command
        Command openNetflix = new OpenNetflixCommand(tv);
        controller.setCommand(openNetflix);
        controller.executeCommand();

        Command turnOffTV = new TurnOffCommand(tv);
        /* write your code here */
        controller.setCommand(turnOffTV);
        controller.executeCommand();
    }
}
