package Homework;


public class Homework7HomeCat {
    private String name;
    private int maxrunlength;
    private int maxswimlength;
    private int run;
    private int swim;
    int y = 100;
    int u = 12;

    public static void main(String[] args) {
        Homework7HomeCat vaska = new Homework7HomeCat();
        vaska.name = "Vaska";
        vaska.maxrunlength = 200;
        vaska.maxswimlength = 0;

        vaska.toRun();
        if (vaska.run < vaska.maxrunlength) {
            System.out.println("Васька пробежал " + vaska.run + "м");
        } else {
            System.out.println("Васька не пробежит столько");
        }
        vaska.toSwim();
        if (vaska.swim > vaska.maxswimlength) {
            System.out.println("Васька не умеет плавать!");
        } else {
            System.out.println("Васька утоп");
        }
    }

    private void toRun() {
        this.run = y;
    }

    private void toSwim() {
        this.swim = u;
    }

}





