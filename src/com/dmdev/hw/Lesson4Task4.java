package com.dmdev.hw;

import java.util.Scanner;

/**
 * 4. Написать программу, которая считывает год, введённый пользователем, и определяет,
 * является ли этот год високосным.
 * Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100,
 * то этот год не високосный, за исключением годов, делящихся на 400.
 * Например:
 * 1992 - високосный
 * 1900 - не високосный
 * 2000 – високосный
 */
public class Lesson4Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int var = in.nextInt();
        isLeapYear(var);
        isLeapYear2(var);
    }

    public static void isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    public static boolean isLeapYear2(int year) {
        boolean result = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
        if (result) {
            return true;
//            System.out.println(year + " год високосный");
        } else {
            return false;
//        System.out.println(year + " год не високосный");
        }

    }
}
