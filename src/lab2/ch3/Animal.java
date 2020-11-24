package lab2.ch3;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }

    public void walk(){
        System.out.println("Walk");
    }

    public void eat(){
        System.out.print("Eat");
    }
}
