package Homework;

public class Homework7Animals {
    public String name;
    public int maxrunlength;
    public int maxswimlenght;
    public int run;
    public int swim;

    public Homework7Animals() {
    }

    public Homework7Animals(String name, int runlength, int swimlength, int run, int swim) {
        this.name = name;
        this.maxrunlength = runlength;
        this.maxswimlenght = swimlength;
        this.run = run;
        this.swim = swim;
    }

    public Homework7Animals(int runlength, int swimlenght) {
        this.maxrunlength = runlength;
        this.maxswimlenght = swimlenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxrunlength() {
        return maxrunlength;
    }

    public void setMaxrunlength(int maxrunlength) {
        this.maxrunlength = maxrunlength;
    }

    public int getMaxswimlenght() {
        return maxswimlenght;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public void setMaxswimlenght(int maxswimlenght) {
        this.maxswimlenght = maxswimlenght;
    }
}






