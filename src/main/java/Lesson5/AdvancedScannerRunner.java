package Lesson5;
import java.util.Scanner;
public class AdvancedScannerRunner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите пож-та число:");
        while (!scanner.hasNextInt()){
           String text= scanner.next();
            System.out.println("Ожидается целое значение+ а Вы ввели не целое"+text);
        }
        int index=scanner.nextInt();
        System.out.println("Наконец-то введено целое значение"+index);
    }
}
