/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8lamdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author User
 */
public class unit1ExSolutionjava7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mijanur", "Rahman", 27),
                new Person("Delonix", "Regia", 18),
                new Person("Nazmul", "Huda", 24)
        );
        // Step 1: Sort list By Last name

        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }

        });

        // Step 2 : Create A method print all element in the list
        System.out.println("print All list of person");
        printAll(people);

        // Step 3 : last name print beginning with c
        System.out.println("Print All last name of ends with a");
        printNameBeginnigWithC(people);

        // Same Step 3 another way
        System.out.println("Print All last name of ends with a another method");
        printConditonal(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().endsWith("a");
            }

        });
    }

    private static void printAll(List<Person> people) {
        for (Person personlist : people) {
            System.out.println(personlist);
        }
    }

    private static void printNameBeginnigWithC(List<Person> people) {
        for (Person person : people) {
            if (person.getLastName().endsWith("a")) {
                System.out.println(person);
            }
        }
    }

    private static void printConditonal(List<Person> people, Condition condition) {
        for (Person per : people) {
            if (condition.test(per)) {
                System.out.println(per);
            }
        }

    }

}

interface Condition {

    boolean test(Person p);
}
