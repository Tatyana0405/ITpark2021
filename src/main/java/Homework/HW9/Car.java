package Homework.HW9;

public final class Car extends Automobile {

    public Car(String model, int maxDistance) {
        super(model, maxDistance);
    }

    @Override
    public void move(Integer distance) {
        if (distance <= maxDistance) {
            System.out.println(model  +"Машина проехала"  +distance  +"км");
        } else {
            System.out.println(model  +" не может проехать"  +distance  +"км");
        }
    }
}
