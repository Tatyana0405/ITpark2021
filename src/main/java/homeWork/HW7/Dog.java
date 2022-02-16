package homeWork.HW7;

public class Dog {
    public String name;
    public int maxRunLength;
    public int maxSwimLenght;

    public Dog(String name, int runlength, int swimlength) {
        this.name = name;
        this.maxRunLength = runlength;
        this.maxSwimLenght = swimlength;

    }

    public void run(Integer distance) {
        if (distance >= maxRunLength) {
            System.out.println("Собака " +name  +" не может пробежать "  +distance +". Может только " +maxRunLength);
        } else {
            System.out.println("Собака"  +name  +" пробежала"  +distance);
        }
    }

    public void swim(Integer distance) {
        if (distance >= maxSwimLenght) {
            System.out.println("Собака "  +name  +" не может проплыть "  +distance  +". Может только " +maxSwimLenght);
        } else {
            System.out.println("Собака "  +name  +" проплыла "  +distance);
        }
    }
}
