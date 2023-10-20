package com.dmdev.hw;

import java.util.Scanner;

/**
 *  2. Дано целое число.
 *     Определить, является ли последняя цифра этого числа – цифрой 3.
 */
public class Lesson4Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите простое число: ");
        int value = in.nextInt();
//        int avr = 3563;
        int testValue = value % 10;
        if (testValue == 3) {
            System.out.println("Число " + value + " заканчивется на цифру 3");
        } else {
            System.out.println("Число " + value + " не заканчивется на цифру 3");
        }
    }
}
