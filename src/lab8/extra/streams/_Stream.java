package lab8.extra.streams;

import lab8.extra.imperativeVersDeclarative.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static lab8.extra.streams._Stream.Gender.*;
import static lab8.extra.streams._Stream.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alex", MALE));
        people.add(new Person("Mara", FEMALE));
        people.add(new Person("Cristi", MALE));
        people.add(new Person("Andrei", MALE));
        people.add(new Person("Irina", FEMALE));
        //people.add(new Person("Bob", PREFER_NOT_SAY));

       /* people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/
        System.out.println("===Contains at least a female");
        Predicate<Person> personPredicate = person -> person.gender.equals(FEMALE);
        boolean containsOnlyFemales = people.stream()
                .anyMatch(personPredicate);
        System.out.println(containsOnlyFemales);

        System.out.println("===All defined");
        boolean allDefined = people.stream()
                .noneMatch(person -> person.gender.equals(PREFER_NOT_SAY));
        System.out.println(allDefined);


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
        FEMALE, MALE,PREFER_NOT_SAY
    }
}
