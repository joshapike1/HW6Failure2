import org.junit.Test;

public class VehicleTest {

    Vehicle[] vehicles = {
            new Car("Honda Civic", 1995, false, 12000, 32, false),
            new Car("Toyota Supra", 2019, true, 49000, 27, true),
            new Car("Toyota Supra", 1998, false, 32000, 15, false),
            new Truck("Toyota Tacoma", 1999, true, 22000, 17, false, 2),
            new Truck("Chevy Silverado", 2000, true, 26000, 11, true, 4)
    };

    @Test
    public void testVehicle() {
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].printVehicle();
            System.out.println();
        }
    }
}