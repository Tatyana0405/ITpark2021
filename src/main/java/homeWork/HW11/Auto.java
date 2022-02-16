package homeWork.HW11;

public abstract class Auto {
    public String number;
    public int speed;
    public double weight;
    public double height;
    public double width;
    public double length;

    public Auto(String number, int speed, double weight, double height, double width, double length) {
        this.number = number;
        this.speed = speed;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public String getNumber() {
        return number;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
