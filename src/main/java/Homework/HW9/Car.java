package Homework.HW9;

public class Car extends Automobile {
protected  String model;
protected int maxDistance=500;
    public Car(String model, int maxDistance){
        this.model=model;
        this.maxDistance=maxDistance;
    }

        @Override
        public void move(Integer distance) {
            if (distance <= maxDistance) {
                System.out.println(model+"Машина проехала" + distance + "км");
            } else {
                System.out.println(model+" не может проехать" + distance + "км");
            }
        }
    }
