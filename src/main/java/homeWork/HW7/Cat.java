package homeWork.HW7;

public class Cat {
    public String name;
    public int maxRunLength;
    public int maxSwimLenght;


    public Cat(String name, int runlength, int swimlength) {
        this.name = name;
        this.maxRunLength = runlength;
        this.maxSwimLenght = swimlength;

    }

    public void run(Integer distance) {
        if (distance >= maxRunLength) {
            System.out.println("Кот "  + name  +" не может пробежать " +distance  +". Может только " +maxRunLength);
        } else {
            System.out.println("Кот "  +name +" пробежал " +distance);
        }
    }

    public void swim(Integer distance) {

        System.out.println("Коты не любят плавать");
    }
}
