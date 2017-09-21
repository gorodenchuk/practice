package inheritance;

/**
 * Created by gorod on 09.09.2017.
 */
public class Truck extends Vehicle {
    private int cargocap;

    public Truck(int p, int f, int m, int cargocap) {
        super(p, f, m);
        this.cargocap = cargocap;
    }
}
