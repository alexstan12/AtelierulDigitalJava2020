package finalProject.builderAndCommand;

/**
 * This is the object that is going to be handled by specific commands,
 * instead of being handled directly by the client
 */
class TV {

    private String resolution;
    private String diagonal;
    private boolean isSmart;
    private boolean isConnected;
    private Channel channel;
    private boolean isOpen;

    // accessed by builder
    private TV(String resolution, String diagonal, boolean isSmart, boolean isConnected) {
        this.resolution = resolution;
        this.diagonal = diagonal;
        this.isSmart = isSmart;
        this.isConnected = isConnected;
    }

    void turnOn() {
        System.out.println("Turning on the TV");
        this.isOpen = true;
        setChannel(new Channel(this, 0));
    }

    void turnOff() {
        if(this.isOpen) {
            this.isOpen = false;
            System.out.println("Turning off the TV");
        }
    }

    void openNetflix() {
        if (this.isConnected && this.isSmart && this.isOpen) {
            System.out.println("Netflix is now open !");
        } else {
            System.out.println("Could not open Netflix - either not open, no internet connection or your TV is not smart");
        }
    }

    boolean setChannel(Channel channel) {
        if (isOpen) {
            this.channel = channel;
            return true;
        }
        return false;
    }

    /**
     * Builder pattern implemented using a static class
     * It makes TV creation much clearer by using methods to set each specific field
     */
    static class TVBuilder {

        private String resolution;
        private String diagonal;
        private boolean isSmart;
        private boolean isConnected;

        public TVBuilder setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }


        public TVBuilder setDiagonal(String diagonal) {
            this.diagonal = diagonal;
            return this;
        }


        public TVBuilder setSmartFunctions(boolean isSmart) {
            this.isSmart = isSmart;
            return this;
        }


        public TVBuilder setInternetConnection(boolean isConnected) {
            this.isConnected = isConnected;
            return this;
        }


        public TV build() {
            return new TV(this.resolution, this.diagonal, this.isSmart, this.isConnected);
        }
    }

}

