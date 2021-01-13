package lab8.extra.imperativeVersDeclarative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Imperative approach
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alex", Gender.MALE));
        people.add(new Person("Mara", Gender.FEMALE));
        people.add(new Person("Cristi", Gender.MALE));
        people.add(new Person("Andrei", Gender.MALE));
        people.add(new Person("Irina", Gender.FEMALE));

        System.out.println("====Imperative Approach====");
        List<Person> females = new ArrayList<>();
        for(Person person : people){
            if(person.gender.equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        for(Person person : females){
            System.out.println(person);
        }

        //Declarative approach
        System.out.println("====Declarative Approach====");
        List<Person> females2 = people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        FEMALE, MALE
    }
}
