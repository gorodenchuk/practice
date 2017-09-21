package inheritance;

/**
 * Created by gorod on 09.09.2017.
 */
public class TruckDemo {
    public static void main(String args[]){

        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Semi can carry " + gallons);

        gallons = pickup.fuelneeded(dist);

        System.out.println("Semi can carry " + gallons);
    }
}
