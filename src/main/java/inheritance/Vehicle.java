package inheritance;

/**
 * Created by gorod on 09.09.2017.
 */
public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    public Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range(){
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

}
