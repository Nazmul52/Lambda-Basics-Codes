/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8lamdabasics.Unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java8lamdabasics.Person;

/**
 *
 * @author User
 */
public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mijanur", "Rahman", 27),
                new Person("Delonix", "Regia", 18),
                new Person("Nazmul", "Huda", 24)
        );

 
   
    
    System.out.println("print All list of person");
    printConditonal(people, p -> true, p -> System.out.println(p));
    
 
    }
   

    private static void printConditonal(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
          for (Person per : people) {
           if(predicate.test(per)){
               consumer.accept(per);
           }
        }
      
    }
}
