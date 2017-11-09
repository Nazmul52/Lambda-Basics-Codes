/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8lamdabasics;

/**
 *
 * @author User
 */
public class Java8Lamdabasics {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Java8Lamdabasics java = new Java8Lamdabasics();
        //java.greet();
        Greeting hello = new HelloGreeting();

        Greeting lamdaGreeting = () -> System.out.println("Hello World");
        lamdaGreeting.perform();
    }

}
