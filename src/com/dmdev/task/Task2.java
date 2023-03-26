package com.dmdev.task;

/**
 *  2. Дано целое число.
 *     Определить, является ли последняя цифра этого числа – цифрой 3.
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 343;
        if (value % 10 == 3) {
            System.out.println("Последняя цифра является 3");
        }
    }
}
