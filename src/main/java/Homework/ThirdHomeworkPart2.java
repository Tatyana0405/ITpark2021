package Homework;

import java.util.Scanner;

public class ThirdHomeworkPart2 {
    public static void main(String[] args) {
        Scanner fact = new Scanner(System.in);
        System.out.println("Введите значение факториала!");
        int n = fact.nextInt();
        System.out.println("Факториал " + n);
        long a = 1;
        int i;

        if (n == 0) {
            System.out.println("Значение факториала = 1");
        } else if (n == 1) {
            System.out.println("Значение факториала = 1");
        } else {
            for (i = 1; i <= n; i++) {
                a = a * i;
            }
            System.out.println("Значение факториала =  " + a);
        }
    }
}

