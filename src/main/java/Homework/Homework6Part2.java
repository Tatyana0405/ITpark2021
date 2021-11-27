package Homework;

import java.util.Scanner;

public class Homework6Part2 {

    public static void main(String[] args) {
        System.out.println("Здравствуйте! ");
        int arrayLength = 50;
        long[] fibonacciArray = new long[arrayLength];
        int lastIndex = 2;
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        fibonacciArray[2] = 1;
        long result;
        while (true) {
            int index = getFibonacciIndex(arrayLength);
            System.out.println(index);
            if (fibonacciArray[index] == 0) {
                fillFibonacciArray(fibonacciArray, lastIndex, index);
            }
            result = fibonacciArray[index];
            System.out.printf("Число, стоящее на %d индексе имеет значение %d \n", index, result);
        }
    }

    private static long fillFibonacciArray(long[] fibonacciArray, int lastIndex, int index) {
        long result;
        System.out.printf("Значение с индексом %d было рассчитано и размещено в кеше\n", index);
        for (int i = lastIndex; i <= index; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        result = fibonacciArray[index];
        return result;
    }

    private static int getFibonacciIndex(int maxIndex) {
        System.out.println("Введите позицию в ряде Фибоначчи как целое число");
        Scanner index = new Scanner(System.in);
        while (!index.hasNextInt()) {
            String command = index.next();
            if ("exit".equalsIgnoreCase(command)) {
                System.out.println("Спасибо заучастие в программе");
                System.exit(0);
            }
            System.out.println("Вводите число, пожалуйста");
            index.next();
        }
        int number = index.nextInt();
        if (number <= 0) {
            System.out.printf("Вы указали отрицательное значение %d, что не допустимо в программе\n", number);
            return getFibonacciIndex(maxIndex);
        } else if (number >= maxIndex) {
            System.out.printf("Вы указали значение большее, чем %d, что не допустимо в программе\n", maxIndex);
            return getFibonacciIndex(maxIndex);
        }
        return number;
    }
}















