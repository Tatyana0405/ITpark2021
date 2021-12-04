package Homework.HW9;

public final class Truck extends Automobile {
    protected  String model;
    protected int maxDistance=1200;
    public Truck (String model, int maxDistance){
        this.model=model;
        this.maxDistance=maxDistance;
    }

    @Override
    public void move(Integer distance) {
        if (distance <= maxDistance) {
            System.out.println(model+" проехал" + distance + "км");
        } else {
            System.out.println(model+" не может проехать" + distance + "км");
        }
    }
}