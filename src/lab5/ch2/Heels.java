package lab5.ch2;

public class Heels implements Shoe{
    private String color;
    private int size;
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }

    public Heels(String color, int size) {
        this.color = color;
        this.size = size;
    }
}
