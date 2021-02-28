package finalProject.builderAndCommand;

class OpenNetflixCommand implements Command {
    private TV tv;

    OpenNetflixCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.openNetflix();
    }
}
