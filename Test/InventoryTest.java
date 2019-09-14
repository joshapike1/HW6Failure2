import org.junit.Test;
import org.junit.Assert;

public class InventoryTest {

    @Test
    public void testAddRemovePrint() {
        Vehicle test_model_1 = new Vehicle("Test Model", 2000, false, 2, 20);
        Vehicle test_model_2 = new Vehicle("Test Model", 2001, false, 2, 21);
        Vehicle test_model_3 = new Vehicle("Test Model", 2002, false, 2, 22);
        Vehicle test_model_4 = new Vehicle("Test Model", 2003, false, 2, 23);

        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(test_model_1);
        vehicleTest.addVehicle(test_model_2);
        vehicleTest.addVehicle(test_model_3);
        vehicleTest.addVehicle(test_model_4);
        vehicleTest.removeVehicle(test_model_4);
        vehicleTest.removeVehicle(test_model_3);
        vehicleTest.removeVehicle(test_model_2);
        vehicleTest.removeVehicle(test_model_1);

        vehicleTest.printAveragePriceOfAllVehicles();
    }

    @Test
    public void testFindCheapestVehicle() {
        // Given
        Vehicle test_model_1 = new Vehicle("Test Model", 2000, false, 10000, 20);
        Vehicle test_model_2 = new Vehicle("Test Model", 2001, false, 11000, 21);
        Vehicle test_model_3 = new Vehicle("Test Model", 2002, false, 12000, 22);
        Vehicle test_model_4 = new Vehicle("Test Model", 2003, false, 13000, 23);

        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(test_model_1);
        vehicleTest.addVehicle(test_model_2);
        vehicleTest.addVehicle(test_model_3);
        vehicleTest.addVehicle(test_model_4);

        // When
        vehicleTest.findCheapestVehicle();

        // Then
        Assert.assertEquals("This is not the cheapest car", test_model_1, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testFindCheapestVehicleZero(){
        // Given
        Vehicle test_model_1 = new Vehicle("Test Model", 2000, false, 10000, 20);
        Vehicle test_model_2 = new Vehicle("Test Model", 2001, false, 11000, 21);
        Vehicle test_model_3 = new Vehicle("Test Model", 2002, false, 12000, 22);
        Vehicle test_model_4 = new Vehicle("Test Model", 2003, false, 0, 23);

        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(test_model_1);
        vehicleTest.addVehicle(test_model_2);
        vehicleTest.addVehicle(test_model_3);
        vehicleTest.addVehicle(test_model_4);

        // When
        vehicleTest.findCheapestVehicle();

        // Then
        Assert.assertEquals("This is not the cheapest car", test_model_4, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testFindCheapestVehicleNegative(){
        // Given
        Vehicle test_model_1 = new Vehicle("Test Model", 2000, false, 10000, 20);
        Vehicle test_model_2 = new Vehicle("Test Model", 2001, false, 11000, 21);
        Vehicle test_model_3 = new Vehicle("Test Model", 2002, false, 12000, 22);
        Vehicle test_model_4 = new Vehicle("Test Model", 2003, false, -13000, 23);

        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(test_model_1);
        vehicleTest.addVehicle(test_model_2);
        vehicleTest.addVehicle(test_model_3);
        vehicleTest.addVehicle(test_model_4);

        // When
        vehicleTest.findCheapestVehicle();

        // Then
        Assert.assertEquals("This is not the cheapest car", test_model_4, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testCheapestVehicleLargeNumber(){
        // Given
        Vehicle test_model_1 = new Vehicle("Test Model", 2000, false, 10000, 20);
        Vehicle test_model_2 = new Vehicle("Test Model", 2001, false, 11000, 21);
        Vehicle test_model_3 = new Vehicle("Test Model", 2002, false, 12000, 22);
        Vehicle test_model_4 = new Vehicle("Test Model", 2003, false, 1300000000, 23);

        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(test_model_1);
        vehicleTest.addVehicle(test_model_2);
        vehicleTest.addVehicle(test_model_3);
        vehicleTest.addVehicle(test_model_4);

        // When
        vehicleTest.findCheapestVehicle();

        // Then
        Assert.assertEquals("This is not the cheapest car", test_model_1, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testFindMostExpensiveVehicle() {
        // Given
        Vehicle test_model_1 = new Vehicle("Test Model", 2000, false, 10000, 20);
        Vehicle test_model_2 = new Vehicle("Test Model", 2001, false, 11000, 21);
        Vehicle test_model_3 = new Vehicle("Test Model", 2002, false, 12000, 22);
        Vehicle test_model_4 = new Vehicle("Test Model", 2003, false, 130000, 23);

        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(test_model_1);
        vehicleTest.addVehicle(test_model_2);
        vehicleTest.addVehicle(test_model_3);
        vehicleTest.addVehicle(test_model_4);

        // When
        vehicleTest.findMostExpensiveVehicle();

        // Then
        Assert.assertEquals("This is not the most expensive vehicle", test_model_4, vehicleTest.findMostExpensiveVehicle());
    }

    @Test
    public void testFindMostExpensiveVehicleNegative() {
        // Given
        Vehicle test_model_1 = new Vehicle("Test Model", 2000, false, 10000, 20);
        Vehicle test_model_2 = new Vehicle("Test Model", 2001, false, 11000, 21);
        Vehicle test_model_3 = new Vehicle("Test Model", 2002, false, 12000, 22);
        Vehicle test_model_4 = new Vehicle("Test Model", 2003, false, -130000, 23);

        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(test_model_1);
        vehicleTest.addVehicle(test_model_2);
        vehicleTest.addVehicle(test_model_3);
        vehicleTest.addVehicle(test_model_4);

        // When
        vehicleTest.findMostExpensiveVehicle();

        // Then
        Assert.assertEquals("This is not the most expensive vehicle", test_model_3, vehicleTest.findMostExpensiveVehicle());
    }

    @Test
    public void testFindMostExpensiveVehicleLarge() {
        // Given
        Vehicle test_model_1 = new Vehicle("Test Model", 2000, false, 10000, 20);
        Vehicle test_model_2 = new Vehicle("Test Model", 2001, false, 11000, 21);
        Vehicle test_model_3 = new Vehicle("Test Model", 2002, false, 12000, 22);
        Vehicle test_model_4 = new Vehicle("Test Model", 2003, false, 130000, 23);

        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(test_model_1);
        vehicleTest.addVehicle(test_model_2);
        vehicleTest.addVehicle(test_model_3);
        vehicleTest.addVehicle(test_model_4);

        // When
        vehicleTest.findMostExpensiveVehicle();

        // Then
        Assert.assertEquals("This is not the most expensive vehicle", test_model_4, vehicleTest.findMostExpensiveVehicle());
    }

}