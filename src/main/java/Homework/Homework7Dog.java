package Homework;

public class Homework7Dog {
    private String name;
    private int maxrunlength;
    private int maxswimlength;
    private int run;
    private int swim;
    int y = 100;
    int u = 12;

    public static void main(String[] args) {
        Homework7Dog bobik = new Homework7Dog();
        bobik.name = "Бобик";
        bobik.maxrunlength = 500;
        bobik.maxswimlength = 10;

        bobik.toRun();
        if (bobik.run < bobik.maxrunlength) {
            System.out.println("Бобик пробежал " + bobik.run+" м");
        } else {
            System.out.println("Бобик не пробежит столько");
        }
        bobik.toSwim();
        if (bobik.swim < bobik.maxswimlength) {
            System.out.println("Бобик проплыл " + bobik.swim+" м");
        } else {
            System.out.println("Бобик столько не проплывет ");
        }
    }
    private void toRun() {
        this.run = y;
    }
    private void toSwim() {
        this.swim = u;
    }
}

