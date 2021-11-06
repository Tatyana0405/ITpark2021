package Homework;

public class SecondHomework {
    // период колебания математического мятника
    double pi, g;
    int l;

    public static double period(double pi, int l, double g) {
        return 2 * pi * Math.sqrt(l / g);
    }

    public static void main(String[] args) {
        double periodResult = period(3.14, 3, 9.81);
        System.out.println(periodResult);
    }
}



