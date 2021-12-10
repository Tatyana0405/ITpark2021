package Homework.HW10;

public enum IndexTemp {

    KELVIN(1), FAHRENHEIT(2), REOMUR(3), KELVINTOCELSIUS(4), FAHRENHEITTOCELSIUS(5), REOMURTOCELSIUS(6);

    private int number;

    IndexTemp(int number) {
        this.number = number;
    }

    public static IndexTemp as(int Ind) {
        for (IndexTemp indexTemp : values()) {
            if (indexTemp.number == Ind) {
                return indexTemp;
            }
        }
        return IndexTemp.KELVIN;
    }
}