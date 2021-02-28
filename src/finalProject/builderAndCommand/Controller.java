package finalProject.builderAndCommand;

/**
 * Also known as the invoker in the Command pattern
 */
class Controller {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void executeCommand() {

        command.execute();
    }
}
