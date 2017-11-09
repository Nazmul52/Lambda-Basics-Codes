/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8lamdabasics.Unit2;

/**
 *
 * @author User
 */
public class MethodReferenceExample_1 {

    public static void main(String[] args) {
        /*
        Thread t = new Thread(() -> printMessage());
        t.start();
         */
        Thread t = new Thread(MethodReferenceExample_1::printMessage);
        t.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }

}
