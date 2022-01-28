package Homework.HW12;

import java.util.Random;

public class Matrix {

    private final int n;
    private final int m;
    private String[][] array;
    private int[][] array1;
    private boolean b;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.array = new String[n][m];
        this.array1 = new int[n][m];
    }

    public void fill() throws MyArraySizeException {
        if (this.m != 4 || this.n != 4) {
            throw new MyArraySizeException(this.m, this.n, "Длина массива не равна 4");
        }
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                StringBuilder builder = new StringBuilder();
                char code = (char) (r.nextInt(50)  +33);
                builder.append(Character.toString(code));
                array[i][j] = builder.toString();
                System.out.print(array[i][j]  +" ");
            }
            System.out.println();
        }
    }

    public int change() throws MyArrayDataException {
        Matrix result = new Matrix(4, 4);
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < this.array1[i].length; j++) {
                try {
                    result.array1[i][j] = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный тип данных "  +array[i][j]);
                }
            }
        }
        return result.change();
    }
}