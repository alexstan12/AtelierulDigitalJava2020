package lab2.ch3;

public class Main {
    public static void main(String[] args) {
        /*Cat cat = new Cat("Oscar");
        Animal animalCat = cat;
        ((Cat) animalCat).play();
        cat.play();
        Spider spider = new Spider();
        spider.eat();*/

        Fish d = new Fish();
        Cat c = new Cat("Pandutu");
        Cat c2 = new Cat();
        System.out.println(c.getName());
        Animal a = new Fish();
        // a.play();  invalid
        ((Fish) a).play();
        Animal e = new Spider();
        ((Spider) e).eat();
        Pet p = new Cat();
    }
}
