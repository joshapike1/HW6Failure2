import java.util.ArrayList;

public class Inventory {

    private ArrayList<Vehicle> Inventory = new ArrayList<Vehicle>();

    // Constructor
    public void Inventory() {
        this.Inventory = null;
    }

    // Add vehicle
    public void addVehicle(Vehicle v) {
        this.Inventory.add(v);
    }

    // Remove vehicle
    public void removeVehicle(Vehicle v) {
        this.Inventory.remove(v);
    }

    // Find cheapest vehicle MSRP
    public Vehicle findCheapestVehicle() {

        double maxValue = Double.MAX_VALUE;
        Vehicle v = new Vehicle("", 0, false, 0, 0);

        for (int i = 0; i < this.Inventory.size(); i++) {
            if (Inventory.get(i).getMSRP() < maxValue) {
                maxValue = Inventory.get(i).getMSRP();
                v = Inventory.get(i);
            }
        }
        return v;
    }

    // Find cheapest vehicle MSRP
    public Vehicle findMostExpensiveVehicle() {
        double minValue = Double.MIN_VALUE;
        Vehicle v = new Vehicle("", 0, false, 0, 0);

        for (int i = 0; i < this.Inventory.size(); i++) {
            if (Inventory.get(i).getMSRP() > minValue) {
                minValue = Inventory.get(i).getMSRP();
                v = Inventory.get(i);
            }
        }
        return v;
    }

    // Print average MSRP of all vehicles
    public void printAveragePriceOfAllVehicles() {
        double pricesAdded = 0;

        for (int i = 0; i < this.Inventory.size(); i++) {
            pricesAdded += Inventory.get(i).getMSRP();
        }
        System.out.println("The average price of the vehicles is " + (pricesAdded / Inventory.size()));
    }
}