package com.dmdev.Lesson5.HW;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] array = {5, 9, 6, 2, 7};
        shiftRight(array);
    }

    public static void shiftRight(int[] array) {
        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;

        System.out.println(Arrays.toString(array));


    }


}
