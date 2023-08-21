package lambda.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static lambda.functionalinterface.TestPerson.Person.Gender.FEMALE;
import static lambda.functionalinterface.TestPerson.Person.Gender.MALE;

public class TestPerson {
    public static void main(String[] args) {
        List<Person> people=List.of(
                new Person("Fahad", MALE),
                new Person("Hasan", MALE),
                new Person("Laiba", FEMALE),
                new Person("Umar", MALE),
                new Person("Rida", FEMALE),
                new Person("Ayesha", FEMALE),
                new Person("Amna", FEMALE),
                new Person("Haroon", MALE),
                new Person("Adeel", MALE)
        );
        System.out.println("// Imperative Approach");
        List<Person> female=new ArrayList<>();
        for (Person person:people) {
         if (FEMALE.equals(person.gender)){
             female.add(person);
         }
        }
        for (Person femaleList:female) {
            System.out.println(femaleList);
        }
        System.out.println("// Declarative Approach // Females DATA");
        Predicate<Person> personPredicate=person ->FEMALE.equals(person.gender);
        List<Person> females2=people
                .stream()
                .filter(personPredicate)
                .toList();
        females2
                .forEach(System.out::println);
        System.out.println("// Declarative Approach // Males DATA");
        people
                .stream()
                .filter(person -> MALE.equals(person.gender))
                .forEach(System.out::println);
    }
    static class  Person {
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

        enum Gender{
            MALE, FEMALE
        }
    }
}
