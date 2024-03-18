package arief.mahendra.generic.application;

import arief.mahendra.generic.Person;

import java.util.Arrays;

public class ComparableApp {

    public static void main(String[] args) {
        Person[] person = new Person[]{
                new Person("Budi", "Bandung"),
                new Person("Arief", "Jakarta"),
                new Person("Caca", "Surabaya"),
        };

        Arrays.sort(person);

        System.out.println(Arrays.toString(person));
    }
}
