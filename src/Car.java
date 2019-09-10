import java.text.DecimalFormat;

public class Car extends Vehicle {

    private boolean isConvertible;

    public Car(String makeAndModel, int year, boolean drive, int MSRP,
               int mpg, boolean isConvertible) {
        super(makeAndModel, year, drive, MSRP, mpg);
        this.isConvertible = isConvertible;
    }

    public boolean getIsConvertible() {
        return (this.isConvertible);
    }

    public void setIsConvertible(boolean YoN) {
        this.isConvertible = YoN;
    }

    public void printVehicle() {
        System.out.println(getYear() + " " + getMakeAndModel());

        if (getIs4WD() == true) System.out.println("4WD");
        else System.out.println("2WD");

        DecimalFormat format = new DecimalFormat("#,###");
        System.out.println("$" + format.format(getMSRP()));
        System.out.println(getMpg() + "MPG");

        if (this.isConvertible == true) System.out.println("Convertible");
        else System.out.println("Not a convertible");
    }
}