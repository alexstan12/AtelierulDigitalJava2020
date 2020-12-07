package lab3.visitor;

public class Audio implements Element {
    private int time;
    private String name;
    private int numberOfSongs;

    public Audio(int time, String name, int numberOfSongs) {
        this.time = time;
        this.name = name;
        this.numberOfSongs = numberOfSongs;
    }

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void accept(Visitor v){
        v.visit(this);
    }


}
