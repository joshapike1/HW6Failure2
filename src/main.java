import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Car Car1 = new Car("Honda Civic", 2013, false, 17000, 32, false);
        Car Car2 = new Car("Porsche 918", 2014, false, 845000, 67, false);
        Car Car3 = new Car("Porsche Boxster", 2016, false, 52000, 32, true);
        Truck Truck1 = new Truck("Ford F-150", 2017, true, 27000, 26, true, 5);
        Truck Truck2 = new Truck("Ram 1500", 2017, true, 26000, 29, false, 3);

        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

        Inventory info = new Inventory();
        info.addVehicle(Car1);
        info.addVehicle(Car2);
        info.addVehicle(Car3);
        info.addVehicle(Truck1);
        info.addVehicle(Truck2);

        for (int i = 0; i < vehicleList.size(); i++) {
            vehicleList.get(i).printVehicle();
            System.out.println();
        }

    }
}