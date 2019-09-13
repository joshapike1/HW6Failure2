import org.junit.Assert;
import org.junit.Test;

    public class CarTest {

        @Test
        public void testGetters() {
            //Given
            Car car = new Car("Porsche Boxster", 2016, false, 52000, 32, true);

            //When
            car.printVehicle();

            //Then
            Assert.assertEquals("Model mismatch", "Porsche Boxster", car.getMakeAndModel());
            Assert.assertEquals("Year mismatch", 2016, car.getYear(), 0.0);
            Assert.assertEquals("WheelDrive mismatch", false, car.getIs4WD());
            Assert.assertEquals("Price mismatch", 52000, car.getMSRP(), 0.0);
            Assert.assertEquals("MPG mismatch", 32, car.getMpg(), 0.0);
            Assert.assertEquals("Convertable mismatch", true, car.getIsConvertible());
        }
}