package Homework.HW12;

public class MatrixRunner {


    public static void main(String[] args) {
        System.out.println("Число строк и число элементов в строке массива равно  4");
        Matrix matrixA = new Matrix(4, 4);
        Matrix matrixB = new Matrix(4, 4);
        System.out.println("Матрица А имеет вид: ");
        try {
            matrixA.fill();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            matrixB.change();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println("Матрица B имеет вид: ");
    }

}