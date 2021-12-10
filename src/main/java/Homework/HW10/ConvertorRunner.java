package Homework.HW10;

import java.util.Scanner;

public class ConvertorRunner {

    public static void main(String[] args) {

        System.out.println("Здравствуйте!Укажите номер соответветствующей конвертации, пожалуйста!");
        System.out.println("---------------------");
        System.out.println("1 - перевод из градусов Цельсия в Кельвины, \n" + "2 -перевод из градусов Цельсия в градусы Фаренгейта,\n" +
                "3 -перевод из градусов Цельсия в градусы Реомюра,\n" + "4-перевод из градусов Кельвина в градусы Цельсия,\n" +
                "5-перевод из градусов Фаренгейта в градусы Цельсия,\n " + "6-перевод из градусов Реомюра в градусы Цельсия");
        System.out.println("-----------------------");

       Scanner ind = new Scanner(System.in);
        while (!ind.hasNextInt()) {
            System.out.println("Вводите число, пожалуйста");
            ind.next();
        }
        int Ind = ind.nextInt();
        if (Ind <= 0) {
            System.out.printf("Вы указали отрицательное значение %d, что не допустимо в программе\n", Ind);
        }
        System.out.println("Индекс= " + Ind);

        System.out.println("Укажите переводимую температуру, пожалуйста");

        Scanner temp = new Scanner(System.in);
        while (!temp.hasNextInt()) {
            System.out.println("Вводите число, пожалуйста");
            temp.next();
        }
        int Temp = temp.nextInt();
        if (Temp <= 0) {
            System.out.printf("Вы указали отрицательное значение %d, что не допустимо в программе\n", Temp);
        }

        System.out.println("Температура= " + Temp);
        System.out.println("---------------------");

        Convertable convertable = new getChange(5, 5);
        convertable.getChange(temp.nextInt(), IndexTemp.KELVIN);

    }
}
