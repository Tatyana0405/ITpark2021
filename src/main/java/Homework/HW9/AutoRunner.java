package Homework.HW9;

public class AutoRunner {

    public static void main(String[] args) {
        Car[] car =new Car [5];
        car [0] = new Car("LadaGranta", 500);
        car[1] = new Car("Priora", 500);
        car[2]  = new Car("X-Ray", 500);
        car[3] = new Car("Vesta", 500);
        car [4] = new Car("2110", 500);

        for (int i=0;i< car.length;i++){
            car[i].move((int)(Math.random()*1000));
        }
        Truck[] truck =new Truck [5];
        truck [0]= new Truck("Белаз", 1200);
        truck [1] = new Truck("МАЗ", 1200);
        truck [2] = new Truck("Газель", 1200);
        truck [3] = new Truck("ЗИЛ", 1200);
        truck [4] = new Truck("MAN", 1200);

        for (int i=0;i< car.length;i++){
            truck[i].move((int)(Math.random()*1000));
        }
    }
}