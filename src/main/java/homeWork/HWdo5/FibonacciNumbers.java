package homeWork.HWdo5;

import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Здравствуйте! Введите выводимое количество чисел Фибоначчи");
        while (!num.hasNextInt()) {
            System.out.println("Вводите число+ пожалуйста");
            num.next();
        }
        int N = num.nextInt();
        System.out.println("Количество чисел: " +N);
        if (N < 0) {
            System.out.println("Число не может быть отрицательным!");
        }
        else {
            int a = 1, b = 1, i;
            System.out.print("0+"+a +"+ " +b);
            for (i = 4; i <= N; i++) {
                b = b +a;
                a = b - a;
                System.out.print("+ " +b);
            }
        }
    }
}


