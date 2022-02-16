package homeWork.HW9;

public class AutoRunner {

    public static void main(String[] args) {
        Automobile[] automobiles = new Automobile[10];
        automobiles[0] = new Car("LadaGranta", 500);
        automobiles[1] = new Car("Priora", 500);
        automobiles[2] = new Car("X-Ray", 500);
        automobiles[3] = new Car("Vesta", 500);
        automobiles[4] = new Car("2110", 500);
        automobiles[5] = new Truck("Белаз", 1200);
        automobiles[6] = new Truck("МАЗ", 1200);
        automobiles[7] = new Truck("Газель", 1200);
        automobiles[8] = new Truck("ЗИЛ", 1200);
        automobiles[9] = new Truck("MAN", 1200);

        for (int i = 0; i < automobiles.length; i++) {
            automobiles[i].move((int) (Math.random() * 1000));
        }
    }
}
