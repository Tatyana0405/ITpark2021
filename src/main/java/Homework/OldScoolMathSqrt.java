package Homework;
import java.util.Scanner;
public class OldScoolMathSqrt {
    public static void main(String[] args) {
        Scanner fact = new Scanner(System.in);
        System.out.println("Введите значение числа из которого излекается корень");
        int n = fact.nextInt();
        System.out.println("извлекаем корень из числа: " + n);
        int sum = 0, result = 0, i;


        if (n < 0) {
            System.out.println("Число не может быть отрицательным!");
        } else {
            for (i = 1; result <= n; i += 2, ++sum) {
                result = result + i;
            }
            System.out.println("Значение квадратного корня  =  " + (sum-1));
        }
    }
}
