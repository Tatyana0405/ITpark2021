package Homework.HW8;

public class AnimalsVoice {

    public static void main(String[] args) {
        Animals[] animals = new Animals[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Parrot();
        animals[3] = new Horse();

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }
    }
}
