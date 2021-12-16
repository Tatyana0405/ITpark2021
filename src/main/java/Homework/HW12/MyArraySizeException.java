package Homework.HW12;

public class MyArraySizeException extends Exception {
    public int n;
    public int m;

    public MyArraySizeException(int n, int m, String message) {
        super(message);
        this.n = n;
        this.m = m;
    }
}