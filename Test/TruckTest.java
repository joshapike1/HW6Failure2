import org.junit.Assert;
import org.junit.Test;

public class TruckTest {

    @Test
    public void testTruckSidestepTrue() {
        // Given
        Truck truck = new Truck("Chevy Silverado", 2000, true, 28000, 14, false, 4);

        // When
        truck.setHasSideStep(true);
        truck.setTowCapacity(5);
        truck.printVehicle();

        // Then
        Assert.assertEquals("Model Mismatch", "Chevy Silverado", truck.getMakeAndModel());
        Assert.assertEquals("Year Mismatch", 2000, truck.getYear());
        Assert.assertEquals("Drive Mismatch", true, truck.getIs4WD());
        Assert.assertEquals("Price Mismatch", 28000, truck.getMSRP());
        Assert.assertEquals("MPG Mismatch", 14, truck.getMpg());
        Assert.assertEquals("Step Mismatch", true, truck.getHasSideStep());
        Assert.assertEquals("Tow Mismatch", 5, truck.getTowCapacity());
    }

    @Test
    public void testTruckSidestepFalse() {
        // Given
        Truck truck = new Truck("Ford F150", 2002, true, 38000, 18, false, 4);

        // When
        truck.setHasSideStep(false);
        truck.setTowCapacity(3);
        truck.printVehicle();

        // Then
        Assert.assertEquals("Model Mismatch", "Ford F150", truck.getMakeAndModel());
        Assert.assertEquals("Year Mismatch", 2002, truck.getYear());
        Assert.assertEquals("Drive Mismatch", true, truck.getIs4WD());
        Assert.assertEquals("Price Mismatch", 38000, truck.getMSRP());
        Assert.assertEquals("MPG Mismatch", 18, truck.getMpg());
        Assert.assertEquals("Step Mismatch", false, truck.getHasSideStep());
        Assert.assertEquals("Tow Mismatch", 3, truck.getTowCapacity());
    }

}