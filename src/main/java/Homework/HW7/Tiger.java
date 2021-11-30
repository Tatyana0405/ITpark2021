package Homework.HW7;

public class Tiger {
    public String name;
    public int maxRunLength;
    public int maxSwimLenght;


    public Tiger(String name, int runlength, int swimlength) {
        this.name = name;
        this.maxRunLength = runlength;
        this.maxSwimLenght = swimlength;
    }

    public void run(Integer distance) {
        if (distance >= maxRunLength) {
            System.out.println("Тигр " + name + " не может пробежать " + distance + ". Может только " + maxRunLength);
        } else {
            System.out.println("Тигр" + name + " пробежал" + distance);
        }
    }

    public void swim(Integer distance) {
        if (distance >= maxSwimLenght) {
            System.out.println("Тигр " + name + " не может проплыть " + distance + ". Может только " + maxSwimLenght);
        } else {
            System.out.println("Тигр" + name + " проплыл " + distance);
        }
    }
}
