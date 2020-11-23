package lab2.ch3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Oscar");
        Animal animalCat = cat;
        ((Cat).animalCat).play();
        cat.play();
    }
}
