package Homework;

import java.util.Scanner;

public class ThirdHomework {
    //решение квадратного уравнения
    public static void main(String[] args) {
        //введите значения a, b, c
        Scanner fact = new Scanner(System.in);
        System.out.println("Введите значение a!");
        double a = fact.nextDouble();
        System.out.println("Коффициент " + a);
        System.out.println("Введите значение b!");
        double b = fact.nextDouble();
        System.out.println("Коэффициент " + b);
        System.out.println("Введите значение c!");
        double c = fact.nextDouble();
        System.out.println("Коффициент " + c);

        double x1, x2, D;
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0!");
        } else {
            D = b * b - 4 * a * c;
            if (D < 0) {
                System.out.println("Нет действительных решений уравнения!");
            } else if (D == 0) {
                System.out.println("Решение уравнения x=" + (-b / 2 / a));
            } else {
                x1 = (-b - Math.sqrt(D) / 2 / a);
                x2 = (-b + Math.sqrt(D) / 2 / a);
                System.out.println("2 решения: x=" + x1 + " и x=" + x2);
            }
        }
    }
}


