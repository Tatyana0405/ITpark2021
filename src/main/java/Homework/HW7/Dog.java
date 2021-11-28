package Homework.HW7;

public class Dog {
    public String name;
    public int maxrunlength;
    public int maxswimlenght;

    public Dog(String name, int runlength, int swimlength) {
        this.name = name;
        this.maxrunlength = runlength;
        this.maxswimlenght = swimlength;

    }

    public void run(Integer distance) {
        if (distance >= maxrunlength) {
            System.out.println("Собака " + name + " не может пробежать " + distance + ". Может только " + maxrunlength);
        } else {
            System.out.println("Собака" + name + " пробежала" + distance);
        }
    }

    public void swim(Integer distance) {
        if (distance >= maxswimlenght) {
            System.out.println("Собака " + name + " не может проплыть " + distance + ". Может только " + maxswimlenght);
        } else {
            System.out.println("Собака " + name + " проплыла " + distance);
        }
    }
}
