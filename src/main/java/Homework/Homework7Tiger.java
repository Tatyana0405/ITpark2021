package Homework;

public class Homework7Tiger {
    private String name;
    private int maxrunlength;
    private int maxswimlength;
    private int run;
    private int swim;
    int y=120;
    int u=120;

    public static void main(String[] args) {
        Homework7Tiger radga = new Homework7Tiger();
        radga.name = "Раджа";
        radga.maxrunlength = 800;
        radga.maxswimlength = 5;


        radga.toRun();
        if (radga.run < radga.maxrunlength) {
            System.out.println("Раджа пробежал " + radga.run + " м");
        } else {
            System.out.println("Раджа не пробежит столько!");
        }
        radga.toSwim();
        if (radga.swim < radga.maxswimlength) {
            System.out.println("Раджа проплыл " + radga.swim + " м");
        } else {
            System.out.println("Раджа столько не проплывет!");
        }
    }

    private void toRun() {
        this.run += y;
    }

    private void toSwim() {
        this.swim += u;
    }

}


