package com.dmdev.Lesson5.HW;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {5, 6, 7, 8, 9};
        int[] array3 = new int[array1.length + array2.length];





        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            System.out.print(Arrays.toString(array3));
            for (int j = 0; j < array2.length; j++) {
                array3[j] = array2[j];

            }

        }
        System.out.print(Arrays.toString(array3));
    }
}
