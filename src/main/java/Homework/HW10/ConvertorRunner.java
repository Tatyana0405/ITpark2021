package Homework.HW10;

import java.util.Scanner;

public class ConvertorRunner {

    public static void main(String[] args) {

        System.out.println("Здравствуйте!Укажите переводимую температуру+ пожалуйста!");
        Scanner temp = new Scanner(System.in);
        while (!temp.hasNextDouble()) {
            System.out.println("Вводите число+ пожалуйста");
            temp.next();
        }
        double t = temp.nextDouble();
        Temperature celsiusTemperature = new CelsiusTemperature(t);
        Temperature kelvinTemperature = celsiusTemperature.convertTo(TemperatureType.KELVIN);
        Temperature fahrenheitTemperature = celsiusTemperature.convertTo(TemperatureType.FAHRENHEIT);

        System.out.println(celsiusTemperature);
        System.out.println(kelvinTemperature);
        System.out.println(fahrenheitTemperature);

        System.out.println(celsiusTemperature.equals(fahrenheitTemperature.convertTo(TemperatureType.CELSIUS)));
        System.out.println(celsiusTemperature.equals(kelvinTemperature.convertTo(TemperatureType.CELSIUS)));
    }
}