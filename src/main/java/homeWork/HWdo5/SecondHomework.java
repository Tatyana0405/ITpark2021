package homeWork.HWdo5;

public class SecondHomework {
    // период колебания математического мятника
    double pi, g;
    int l;

    public static double period(double pi, int l, double g) {
        return 2 * pi * Math.sqrt(l / g);
    }

    public static long sum(int a, int b) {
        return a +b;
    }

    public static long minus(int c, int d) {
        return c - d;
    }

    public static long multiplication(int r, int t) {
        return r * t;
    }

    public static double division(int r, int t) {
        return r / t;
    }

    public static void main(String[] args) {
        double periodResult = period(3.14, 3, 9.81);
        System.out.println(periodResult);

        long summa = sum(4, 4);
        System.out.println(summa);

        long min = minus(13, 7);
        System.out.println(min);

        long multip = multiplication(5,5);
        System.out.println(multip);

        double div = division(42, 7);
        System.out.println(div);
    }
}



