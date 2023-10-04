package com.dmdev.hw;

import java.util.Scanner;

/**
 * 1. Дан порядковый номер месяца.
 *    Вывести на консоль пору года, к которой относится месяц.
 */

public class Lesson4Task1 {
    public static void main(String[] args) {
//        1-2 и 12 - зима, 3-5 - весна, 6-8 -лето, 9-11 - осень
        System.out.print("Введите порядковый номер месяца: ");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
//        int value = 1;

        extracted(value);
    }

    private static void extracted(int value) {
        if (value == 1 || value == 2 || value == 12) {
            System.out.println("Время года - Зима");
        } else if (value >= 3 && value <= 5) {
            System.out.println("Время года - Весна");
        } else if (value >= 6 && value <= 8) {
            System.out.println("Время года - Лето");
        } else if (value >=9 && value <= 11) {
            System.out.println("Время года - Осень");
        } else System.out.println("Месяц введён не корректно");
    }
}
