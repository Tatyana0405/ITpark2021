package Homework.HW13;

public class Employee {
    public String name;
    public int personnelNumber;
    public int workAge;

    public Employee(String name, int personnelNumber, int workAge) {
        this.name = name;
        this.personnelNumber = personnelNumber;
        this.workAge = workAge;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", personnelNumber=" + personnelNumber +
                ", workAge=" + workAge +
                '}';
    }

    public Employee(int workAge) {
        this.workAge = workAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
}
