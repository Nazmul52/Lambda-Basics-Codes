/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8lamdabasics.Unit2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java8lamdabasics.Person;

/**
 *
 * @author User
 */
public class StreamExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mijanur", "Rahman", 27),
                new Person("Delonix", "Regia", 18),
                new Person("Nazmul", "Huda", 24)
        );
       people.stream()
               .filter(p -> p.getLastName().startsWith("R"))
               
               .forEach(p -> System.out.println(p.getFirstName()));
        
       
   long count =  people.stream()
        .filter(p -> p.getLastName().startsWith("R"))
             .count();
        System.out.println(count);
    }
}
