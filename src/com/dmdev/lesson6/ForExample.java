package com.dmdev.lesson6;

public class ForExample {
    public static void main(String[] args) {
        for (int value = 10; value > 0; value--) {
            System.out.println(value);
            if (value == 5) {
                continue;   //скипает код перед ним
//                break;
            }
        }

    }

    private static void forExample() {
        int i = 0;
        for ( ; ; ) {
            System.out.println(i);
        }
    }
    //        for (int value = 10; value > 0; value--) {
//            System.out.println(value);
//        }
}
