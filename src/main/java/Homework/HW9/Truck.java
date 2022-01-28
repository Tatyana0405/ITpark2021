package Homework.HW9;

public final class Truck extends Automobile {

    public Truck(String model, int maxDistance) {
        super(model, maxDistance);
    }

    @Override
    public void move(Integer distance) {
        if (distance <= maxDistance) {
            System.out.println(model  +" проехал"  +distance  +"км");
        } else {
            System.out.println(model  +" не может проехать"  +distance  +"км");
        }
    }
}