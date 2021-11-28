package Homework.HW7;

public class Tiger {
    public String name;
    public int maxrunlength;
    public int maxswimlenght;


    public Tiger(String name, int runlength, int swimlength) {
        this.name = name;
        this.maxrunlength = runlength;
        this.maxswimlenght = swimlength;
    }

    public void run(Integer distance) {
        if (distance >= maxrunlength) {
            System.out.println("Тигр " + name + " не может пробежать " + distance + ". Может только " + maxrunlength);
        } else {
            System.out.println("Тигр" + name + " пробежал" + distance);
        }
    }

    public void swim(Integer distance) {
        if (distance >= maxswimlenght) {
            System.out.println("Тигр " + name + " не может проплыть " + distance + ". Может только " + maxswimlenght);
        } else {
            System.out.println("Тигр" + name + " проплыл " + distance);
        }
    }
}
