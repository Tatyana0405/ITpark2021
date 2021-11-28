package Homework.HW7;

public class Cat {
    public String name;
    public int maxrunlength;
    public int maxswimlenght;


    public Cat(String name, int runlength, int swimlength) {
        this.name = name;
        this.maxrunlength = runlength;
        this.maxswimlenght = swimlength;

    }

    public void run(Integer distance) {
        if (distance >= maxrunlength) {
            System.out.println("Кот " + name + " не может пробежать " + distance + ". Может только " + maxrunlength);
        } else {
            System.out.println("Кот " + name + " пробежал " + distance);
        }
    }

    public void swim(Integer distance) {
        System.out.println("Коты не любят плавать");
    }
}
