package com.dmdev.lesson4;

public class SwitchExample {
    public static void main(String[] args) {
//        byte, short. int, char, String, enum
        int value = 100;
        switch (value) {
            case 1 -> System.out.println(" ");
            case 2, 3, 4 -> System.out.println(" ");
            default -> {
            }

        }
        switch (value) {
            case 1:
                System.out.println("value == 1");
                break;
            case 2:
                System.out.println("value == 2");
                break;
            case 10:
                System.out.println("value == 10");
                break;
            case 28:
                System.out.println("value == 28");
                break;
            case 100:
                break;
            default:
                System.out.println("Нет такого значения");
        }
    }
}
