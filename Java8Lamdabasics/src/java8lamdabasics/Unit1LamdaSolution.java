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
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author User
 */
//Lambda Expression Example
public class Unit1LamdaSolution {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mijanur", "Rahman", 27),
                new Person("Delonix", "Regia", 18),
                new Person("Nazmul", "Huda", 24)
        );
        // Step 1: Sort list By Last name

        Collections.sort(people, (p1, p2)
                -> p1.getLastName().compareTo(p2.getLastName())
        );

        // Step 2 : Create A method print all element in the list
        System.out.println("print All list of person");
        printConditonal(people, p -> true, p -> System.out.println(p));

        // Step 3 : last name print beginning with c
        // Same Step 3 another way
        System.out.println("Print All last name of ends with a another method");
        printConditonal(people, p -> p.getLastName().endsWith("a"), p -> System.out.println(p.getFirstName()));
    }

    private static void printConditonal(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person per : people) {
            if (predicate.test(per)) {
                consumer.accept(per);
            }
        }

    }

}
