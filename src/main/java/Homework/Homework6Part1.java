package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6Part1 {

    public static void main(String[] args) {
        System.out.println("Здравствуйте! Укажите длину массива");
        int size = getArrayLength();
        int[] arr = fillArray(size);
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество чисел: " + size);
        int max = getMax(arr);
        System.out.println("Максимум в массиве" + max);
        int max2 = getAnotherMax(arr);
        System.out.println("Максимум в массиве(другой способ)" + max2);
        int min = getMin(arr);
        System.out.println("Минимум в массиве" + min);
        double avg = getAvg(size, arr);
        System.out.println("Среднее арифметическое значение" + avg);
    }

    private static double getAvg(int size, int[] arr) {
        double avg = 0;
        for (int digit : arr) {
            avg += digit;
        }
        avg /= size;
        return avg;
    }

    private static int[] fillArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round((float) Math.random() * 1000);
        }
        return arr;

    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int getAnotherMax(int[] arr) {
        int max2 = arr[0];
        for (int i : arr) {
            max2 = Math.max(max2, i);
        }
        return max2;
    }

    private static int getMin(int[] arr) {
        int min = arr[arr.length - 1];
        if (arr.length > 1) {
            for (int i = arr.length - 2; i >= 0; i--) {
                int digit = arr[i];
                if (digit < min) {
                    min = digit;
                }
            }
        }
        return min;
    }

    private static int getArrayLength() {
        Scanner num = new Scanner(System.in);
        while (!num.hasNextInt()) {
            System.out.println("Вводите число, пожалуйста");
            num.next();
        }
        int size = num.nextInt();
        if (size <= 0) {
            System.out.printf("Вы указали отрицательное значение %d, что не допустимо в программе\n", size);
            return getArrayLength();
        }
        return size;
    }
}





