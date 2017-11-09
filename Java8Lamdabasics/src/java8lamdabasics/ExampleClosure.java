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
public class ExampleClosure {

    public static void main(String[] args) {
        int a = 10;
        int j = 20;

        doProcess(a, (i) -> System.err.println(a + j));

        /*
        doProcess(i, new Process(){
           @Override
           public void process(int i) {
               System.err.println(i + j);
           }
            
        });
         */
    }

    public static void doProcess(int i, Process p) {
        p.process(i);

    }
}

interface Process {

    void process(int i);
}
