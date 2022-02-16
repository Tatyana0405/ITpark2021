package homeWork.HW9;

public abstract class Automobile {
    protected String model;
    protected int maxDistance;
public Automobile(String model, int maxDistance){
    this.model=model;
    this.maxDistance=maxDistance;
}
    public abstract void move(Integer distance);
}

