package com.dmdev.Lesson5.HW;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] array = {2, 6, 7, 1, 5, 2};
        delNumb(array);
        System.out.println(Arrays.toString(array));
    }

    public static void delNumb(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i +1; j < array.length; j++) {
                if (array [j] == array[i]) {
                    array[j] = 0;
                }
            }


        }
    }
}