/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8lamdabasics.Unit2;

import java.util.Arrays;
import java.util.List;
import java8lamdabasics.Person;

/**
 *
 * @author User
 */
public class CollectionIterationexample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mijanur", "Rahman", 27),
                new Person("Delonix", "Regia", 18),
                new Person("Nazmul", "Huda", 24)
        );
        System.err.println("Usong for Loop");
        for (int i = 0; i < people.size(); i++) {
            System.err.println(people.get(i));
        }

        System.err.println("Using For in or each Loop");
        for (Person person : people) {
            System.err.println(person);
        }
        System.err.println("Using Lambda Foreach Loop");
        people.forEach((p -> System.err.println(p)));
    }
}
