package lab3.hardCodeChallenge2;

public class Main {
    public static void main(String[] args) {
        IPerson person = new Person.Builder().setName("Duke").build();
        person.walk();
        person.drink();
    }
}
