package lab2.ch3;

public class Spider extends Animal{
    protected Spider(){
        super(8);
    }

    public void eat(){
        super.eat();
        System.out.print(" like a spider");
    }
}
