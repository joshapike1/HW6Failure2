import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {


    @Test
    public void testVehicle4WD() {
        // Given
        Vehicle vehicle = new Vehicle("Honda Accord", 1991, false, 11000, 26);

        // When
        vehicle.setMakeAndModel("Honda Accord");
        vehicle.setYear(2010);
        vehicle.setIs4WD(true);
        vehicle.setMSRP(12000);
        vehicle.setMpg(12);
        vehicle.printVehicle();

        // Then
        Assert.assertEquals("Model Mismatch", "Honda Accord", vehicle.getMakeAndModel());
        Assert.assertEquals("Year Mismatch", 2010, vehicle.getYear());
        Assert.assertEquals("Drive Mismatch", true, vehicle.getIs4WD());
        Assert.assertEquals("Price Mismatch", 12000, vehicle.getMSRP());
        Assert.assertEquals("MPG Mismatch", 12, vehicle.getMpg());

    }

    @Test
    public void testVehicle2WD() {
        // Given
        Vehicle vehicle = new Vehicle("Honda Accord", 1991, false, 11000, 26);

        // When
        vehicle.setMakeAndModel("Honda Accord");
        vehicle.setYear(2010);
        vehicle.setIs4WD(false);
        vehicle.setMSRP(12000);
        vehicle.setMpg(12);
        vehicle.printVehicle();

        // Then
        Assert.assertEquals("Model Mismatch", "Honda Accord", vehicle.getMakeAndModel());
        Assert.assertEquals("Year Mismatch", 2010, vehicle.getYear());
        Assert.assertEquals("Drive Mismatch", false, vehicle.getIs4WD());
        Assert.assertEquals("Price Mismatch", 12000, vehicle.getMSRP());
        Assert.assertEquals("MPG Mismatch", 12, vehicle.getMpg());

    }
}