package Homework.HW11;

public class AutoRunner {
    public static void main(String[] args) {
        Kpp kpp = new Kpp(80, 100, 8.0, 4.0, 2.5);

        Auto[] autos = new Auto[12];
        autos[0] = new Car("У123СО", 100, 1.2, 1.5, 1.7, 4.5);
        autos[1] = new Car("H203ТТ", 110, 1.5, 1.7, 2.0, 5.0);
        autos[2] = new Car("Р111АА", 80, 1.3, 1.5, 1.7, 4.5);
        autos[3] = new Car("К550ТО", 70, 1.4, 1.5, 1.7, 4.5);
        autos[4] = new Car("Е645СС", 60, 1.6, 1.5, 1.7, 4.5);
        autos[5] = new Truck("T235СО", 70, 5.0, 4.5, 2.1, 6);
        autos[6] = new Truck("М555ОС", 100, 6.0, 4.0, 2.5, 7);
        autos[7] = new Truck("Х333ОО", 50, 8.0, 3.8, 2.6, 8);
        autos[8] = new Truck("T999ММ", 60, 10.0, 3.9, 2.4, 7);
        autos[9] = new Truck("Н568НО", 40, 6.0, 3.6, 2.3, 6);
        autos[10] = new Car("Е111КХ", 20, 1.7, 1.8, 2.1, 5.5);
        autos[11] = new Car("А236СО", 90, 1.6, 1.7, 1.9, 4.5);

        for (Auto auto : autos) {
            try {
                kpp.check(auto);
            } catch (IllegalStateException e) {
                System.out.println("Внимание!!! " + e.getMessage());
            }
        }
    }
}
