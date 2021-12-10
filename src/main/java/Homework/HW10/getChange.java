package Homework.HW10;

public class getChange implements Convertable {
    public double Temp;
    public int Ind;
    public int t = 0;

    public getChange(double Temp, int Ind) {
        this.Temp = Temp;
        this.Ind = Ind;
    }


    public int getChange(int Temp, IndexTemp indexTemp) {
        switch (indexTemp) {
            case KELVIN: {
                t = Temp + 273;
                System.out.println("Температура по шкале Кельвина "+t);
                return (int) t;
            }
            case FAHRENHEIT: {
                t = (int) (Temp * 9 / 5 + 32);
                System.out.println("Температура по шкале Фарентгейта "+t);
                return t;
            }
            case REOMUR: {
                t = (int) (Temp * 0.8);
                System.out.println("Температура по шкале Реомюра "+t);
                return t;
            }
            case KELVINTOCELSIUS: {
                t = Temp - 273;
                System.out.println("Температура по шкале Цельсия "+t);
                return t;
            }
            case FAHRENHEITTOCELSIUS: {
                t = (int) ((Temp - 32 * 5 / 9) - 32);
                System.out.println("Температура по шкале Цельсия "+t);
                return t;
            }
            case REOMURTOCELSIUS: {
                t = (int) (Temp * 1.25);
                System.out.println("Температура по шкале Цельсия "+ t);
                return t;
            }
            default: {
                break;
            }
        }
        return t;

    }
}