package Homework;

import java.util.Scanner;
import java.util.Arrays;

public class Homework6Part2 {

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
            int[] userArray = new int[size];
            int[] fibonArray = new int[25];
            fibonArray[0] = 0;
            fibonArray[1] = 1;
            fibonArray[2] = 1;

            for (int i = 3; i < fibonArray.length; i++) {
                fibonArray[i] = fibonArray[i - 2] + fibonArray[i - 1];
            }

            if (userArray.length <= fibonArray.length) {
                System.arraycopy(fibonArray, 0, userArray, 0, userArray.length);
                System.out.println(Arrays.toString(userArray));
            } else {
                System.arraycopy(fibonArray, 0, userArray, 0, fibonArray.length - 3);
                userArray[fibonArray.length - 2] = fibonArray[fibonArray.length - 2];
                userArray[fibonArray.length - 1] = fibonArray[fibonArray.length - 1];
                for (int i = fibonArray.length-1; i < userArray.length; i++) {
                    userArray[i] = userArray[i - 1] + userArray[i - 2];
                }
                System.out.println(Arrays.toString(userArray));
            }
        }
    }
}





