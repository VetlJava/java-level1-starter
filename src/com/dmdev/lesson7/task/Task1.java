package com.dmdev.lesson7.task;

/**
 * 1. Написать программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, 5, 7, 9, 11};
        printArray(values);
    }
    public static void  printArray(int[] values){
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
        }
        System.out.println();
    }
}
