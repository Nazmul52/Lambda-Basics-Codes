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
public class Runnable {

    public static void main(String[] args) {

        Thread myThread = new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });
        myThread.run();

        Thread myLanbdaThread = new Thread(() -> System.out.println("Lambda Runnable"));
        myLanbdaThread.run();
    }

}
