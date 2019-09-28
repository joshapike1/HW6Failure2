import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Inventory extends ArrayList implements Serializable {

    public static List<Vehicle> Inventory;

    public Inventory() {
        Inventory = new ArrayList<>();
    }

    // Constructors
    public List<Vehicle> getInventoryList() {
        return Inventory;
    }

    // Add vehicle
    public static void addVehicle(Vehicle v) {
        Inventory.add(v);
    }

    // Remove vehicle
    public void removeVehicle(Vehicle v) {
        Inventory.remove(v);
    }

    // Find cheapest vehicle MSRP
    public Vehicle findCheapestVehicle() {

        Vehicle cheap = Inventory.get(0);

        for (int i = 0; i < this.Inventory.size(); i++) {
            if (Inventory.get(i).getMSRP() < cheap.getMSRP()) {
                cheap = Inventory.get(i);
            }
        }
        return cheap;
    }

    public int getSize() {
        return Inventory.size();
    }

    public Vehicle get(int index) {
        return Inventory.get(index);
    }

    // Find cheapest vehicle MSRP
    public Vehicle findMostExpensiveVehicle() {
        Vehicle expensive = Inventory.get(0);

        for (int i = 0; i < this.Inventory.size(); i++) {
            if (Inventory.get(i).getMSRP() > expensive.getMSRP()) {
                expensive = Inventory.get(i);
            }
        }
        return expensive;
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