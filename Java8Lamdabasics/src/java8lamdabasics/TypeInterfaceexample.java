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
public class TypeInterfaceexample {

    public static void main(String[] args) {
        StringLengthLambda myLambda = (String a) -> a.length();
        System.out.println(myLambda.getLength("Hello Lambda"));
    }

    interface StringLengthLambda {

        int getLength(String s);
    }
}
