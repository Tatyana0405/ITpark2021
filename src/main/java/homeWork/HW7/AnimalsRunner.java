package homeWork.HW7;

public class AnimalsRunner {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 200, 0);
        cat.run(100);
        cat.swim(12);
        Dog dog = new Dog("Bobik", 500, 10);
        dog.run(25);
        dog.swim(30);
        Tiger tiger = new Tiger("Раджа", 2500, 15);
        tiger.run(90);
        tiger.swim(14);
    }
}