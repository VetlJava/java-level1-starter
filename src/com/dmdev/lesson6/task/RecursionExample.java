package com.dmdev.lesson6.task;
/**
 * 1. Написать программу высчитывающую
 *    факториал введённого целого числа.
 */
public class RecursionExample {
    public static void main(String[] args) {
        int factorial = factorial(6);
        System.out.println(factorial);
    }
    public static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
//        6 * (5 * (4 * (3 * (2 * 1))))
        return value * factorial(value - 1);
    }
}
