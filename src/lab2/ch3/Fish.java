package lab2.ch3;

public class Fish extends Animal implements Pet {
    private String name;

    public String getName(){
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void play(){
        System.out.println("Play like a fish");
    }

    public void walk(){
        super.walk();
        System.out.println(" like a fish");
    }

    public void eat(){
        super.eat();
        System.out.println(" like a fish");
    }
}
