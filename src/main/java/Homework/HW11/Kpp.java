package Homework.HW11;

public class Kpp {

    private final int speedLimit;
    private final int speedLimit2;
    private final double weightLimit;
    private final double heightLimit;
    private final double widthLimit;

    public Kpp(int speedLimit, int speedLimit2, double weightLimit, double heightLimit, double widthLimit) {
        this.speedLimit = speedLimit;
        this.speedLimit2 = speedLimit2;
        this.weightLimit = weightLimit;
        this.heightLimit = heightLimit;
        this.widthLimit = widthLimit;
    }

    public void check(Auto auto) {
        if (auto.getSpeed() >= speedLimit) {
            if (auto.getSpeed() >= speedLimit2) {
                throw new IllegalStateException("Вызвана полиция для " + auto.getNumber() + " за скорость выше " + speedLimit2 + " км/ч");
            } else {
                throw new IllegalStateException("Превышение скорости автомобилем  " + auto.getNumber());
            }
        } else {
            if (auto.getHeight() >= heightLimit) {
                throw new IllegalStateException("Превышение допустимой высоты у автомобиля " + auto.getNumber());
            }
            if (auto.getWidth() >= widthLimit) {
                throw new IllegalStateException("Превышение допустимой ширины у автомобиля " + auto.getNumber());
            }
            if (auto.getWeight() >= weightLimit) {
                throw new IllegalStateException("Превышение допустимого веса у автомобиля " + auto.getNumber());
            }
        }
    }
}