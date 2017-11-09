/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8lamdabasics;

import java.util.function.BiConsumer;

/**
 *
 * @author User
 */
public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3};
        int key = 0;

        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someNumbers) {

            biConsumer.accept(i, key);

        }
    }

    public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.err.println(e);
            }

        };
    }
}
