package com.dmdev.hw;

import java.util.Scanner;

/**
 * Имеется целое число, вводимое пользователем с консоли.
 * Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */

public class Lesson4Task3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            int rubles = in.nextInt();

//         int rubles = 112;
//        рубль 1 !11
//        рублей 5, 6, 7, 8, 9, 10, 11-19
//        рубля 2, 3, 4

            if ((rubles % 10 == 1) && (rubles % 100 != 11)) {
                System.out.println("рубль");
            } else if ((rubles % 10 == 2 || rubles % 10 == 3 ||
                    rubles % 10 == 4) && !(rubles % 100 == 12 ||
                    rubles % 100 == 13 || rubles % 100 == 14)) {
                System.out.println("рубля");
            } else {
                System.out.println("рублей");
            }
        } catch (Exception e) {
            System.out.println("Ошибка, ввели букву или большое число. Код ошибки: " + e.getMessage());
        }
    }
}
