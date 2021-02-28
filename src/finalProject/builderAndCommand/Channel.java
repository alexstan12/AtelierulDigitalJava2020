package finalProject.builderAndCommand;

class Channel {
    private TV tv;
    private int channelNumber;

    Channel(TV tv, int channelNumber) {
        /* write your code here */
        this.tv = tv;
        this.channelNumber = channelNumber;
    }

    void changeChannel() {
        if(tv.setChannel(this)) {
            System.out.println("Channel was changed to " + channelNumber);
        }
    }
}
