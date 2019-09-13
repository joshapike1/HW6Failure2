import org.junit.Test;

public class VehicleTest {


    @Test
    public void testGetters() {
    //given
    Vehicle vehicle = new Vehicle("Honda Civic", 2013, false, 17000, 32);

    //when
        vehicle.printVehicle();

    //then
        Assert.assertEquals("Model mismatch", "Honda Civic", vehicle.getMakeModel());
        Assert.assertEquals("Year mismatch", 2013, vehicle.getModelYear(), 0.0);
        Assert.assertEquals("WheelDrive mismatch", false, vehicle.getWheelDrive());
        Assert.assertEquals("Price mismatch", 17000, vehicle.getRetailPrice(), 0.0);
        Assert.assertEquals("MPG mismatch", 32, vehicle.getMpg(), 0.0);

}
}