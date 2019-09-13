import org.junit.Test;
import org.junit.Assert;

public class InventoryTest {

    @Test
    public void testCheapestVehicleNormal(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 200, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findCheapestVehicle();

        //then
        Assert.assertEquals("Not cheapest car", norm4, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testCheapestVehicleZero(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 0, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findCheapestVehicle();

        //then
        Assert.assertEquals("Not cheapest car", norm4, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testCheapestVehicleNegative(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, -1, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findCheapestVehicle();

        //then
        Assert.assertEquals("Not cheapest car", norm4, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testCheapestVehicleHigh(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 1000000000, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findCheapestVehicle();

        //then
        Assert.assertEquals("Not cheapest car", norm3, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testExpensiveVehicleNormal(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 13000, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findMostExpensiveVehicle();

        //then
        Assert.assertEquals("Not cheapest car", norm4, vehicleTest.findMostExpensiveVehicle());
    }

    @Test
    public void testExpensiveVehicleLarge(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 1000000000, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findMostExpensiveVehicle();

        //then
        Assert.assertEquals("Not cheapest car", norm4, vehicleTest.findMostExpensiveVehicle());
    }


    @Test
    public void testExpensiveVehicleDecimalNegativeZero(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 0, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000.98, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, -8000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 500, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findMostExpensiveVehicle();

        //then
        Assert.assertEquals("Not cheapest car", norm2, vehicleTest.findMostExpensiveVehicle());
    }

    @Test
    public void testExpensiveVehicleNoData(){
        //given
        Vehicle norm1 = new Vehicle("", 0, false, 0, 0);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);

        //when
        vehicleTest.findMostExpensiveVehicle();

        //then
        Assert.assertEquals("Not cheapest car", "No vehicle", vehicleTest.findMostExpensiveVehicle());
    }

}