package arief.mahendra.generic.application;

import arief.mahendra.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {

    public static void main(String[] args) {
        Person[] person = new Person[]{
                new Person("Budi", "Bandung"),
                new Person("Arief", "Jakarta"),
                new Person("Caca", "Surabaya")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(person, comparator);

        System.out.println(Arrays.toString(person));
    }
}