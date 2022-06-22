package com.springboot.blog2.controller;

/*삽입정렬*/
public class Cccc {
    public static void main(String[] args) {
        // Ready
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] = (int)(Math.random() * 10));
        }
        System.out.println();

        // Execute
        for (int i = 1; i < a.length; i++) {
            int target = a[i];
            int j = i - 1;
            //타겟이 이전 원소보다 크기 전까지 반복
            while (j >= 0 && target < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = target;
            // Done!
            for (int k = 0; k < a.length; k++) {
                System.out.print(a[k]);
            }
            System.out.println();
        }
    }
}
