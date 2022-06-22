package com.springboot.blog2.controller;

/*선택정렬*/
public class Bbbb {
    public static void main(String[] args) {
        // Ready
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] = (int)(Math.random() * 10));
        }
        System.out.println();
        // Execute
        for (int i = 0; i < a.length-1; i++) {
            int min_index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }
            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
            // Done!
            for (int k = 0; k < a.length; k++) {
                System.out.print(a[k]);
            }
            System.out.println();
        }
    }
}
