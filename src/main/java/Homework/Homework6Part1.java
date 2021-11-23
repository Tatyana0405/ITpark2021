package Homework;

import java.util.Scanner;
import java.util.Arrays;

public class Homework6Part1 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Здравствуйте! Введите количество элементов массива");
        while (!num.hasNextInt()) {
            System.out.println("Вводите число, пожалуйста");
            num.next();
        }
        int size = num.nextInt();
        System.out.println("Количество чисел: " + size);
        if (size < 0) {
            System.out.println("Число не может быть отрицательным!");
        } else {
            double[] arr = new double[size];
            double sred = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Math.random();
                sred += arr[i];
                System.out.println(arr[i]);
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println("--------------------------------");
            System.out.println("Минимальное значение: " + arr[0]);
            System.out.println("Максимальное значение: " + arr[arr.length - 1]);
            System.out.println("Среднее значение:  " + sred / size);
        }
    }
}

