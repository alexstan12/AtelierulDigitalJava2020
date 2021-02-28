package finalProject.builderAndCommand;

class ChangeChannelCommand implements Command {

    private Channel channel;

    ChangeChannelCommand(Channel channel) {
        this.channel = channel;
    }

    @Override
    /* write your code here */
    public void execute() {
        channel.changeChannel();
    }

}
