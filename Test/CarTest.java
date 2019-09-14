import org.junit.Assert;
import org.junit.Test;

    public class CarTest {

        @Test
        public void testCar() {
            // Given
            Car car = new Car("Chevy Malibu", 2018, true, 42000, 26, false);

            // When
            car.setIsConvertible(false);
            car.printVehicle();

            // Then
            Assert.assertEquals("Model Mismatch", "Chevy Malibu", car.getMakeAndModel());
            Assert.assertEquals("Year Mismatch", 2018, car.getYear());
            Assert.assertEquals("Drive Mismatch", true, car.getIs4WD());
            Assert.assertEquals("MSRP Mismatch", 42000, car.getMSRP());
            Assert.assertEquals("MPG Mismatch", 26, car.getMpg());
            Assert.assertEquals("Convertable Mismatch", false, car.getIsConvertible());
        }
}