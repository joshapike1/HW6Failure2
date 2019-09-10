public class main {
    public static void main(String[] args) {

        Vehicle[] vehicleInfo = {
                new Car("Honda Civic", 2013, false, 17000, 32, false),
                new Car("Porsche 918", 2014, false, 845000, 67, false),
                new Car("Porsche Boxster", 2016, false, 52000, 32, true),
                new Truck("Ford F-150", 2017, true, 27000, 26, true, 5),
                new Truck("Ram 1500", 2017, true, 26000, 29, false, 3)
        };

        for (int i = 0; i < vehicleInfo.length; i++) {
            vehicleInfo[i].printVehicle();
            System.out.println("");
        }

    }
}