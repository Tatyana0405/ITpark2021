/*package Homework;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
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
        }
        else {
            int[] arr=new int[size];
for (int i=0; i<arr.length;i++){
    arr[i]=(int)Math.random();}

     Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort (arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
}
        }
}*/
