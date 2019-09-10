import java.text.DecimalFormat;

public class Truck extends Vehicle {

    private boolean hasSideStep;
    private int towCapacity;

    public Truck(String makeAndModel, int year, boolean is4WD, int MSRP, int mpg, boolean hasSideStep, int towCapacity) {
        super(makeAndModel, year, is4WD, MSRP, mpg);
        this.hasSideStep = hasSideStep;
        this.towCapacity = towCapacity;
    }

    public boolean getHasSideStep() {
        return (this.hasSideStep);
    }

    public int getTowCapacity() {
        return (this.towCapacity);
    }

    public void setHasSideStep(boolean YoN) {
        this.hasSideStep = YoN;
    }

    public void setTowCapacity(int capacity) {
        this.towCapacity = capacity;
    }

    public void printVehicle() {
        System.out.println(getYear() + " " + getMakeAndModel());

        if (getIs4WD() == true) System.out.println("4WD");
        else System.out.println("2WD");

        DecimalFormat format = new DecimalFormat("#,###");
        System.out.println("$" + format.format(getMSRP()));
        System.out.println(getMpg() + "MPG");

        if (this.hasSideStep == true) System.out.println("Has side step");
        else System.out.println("No Side Step");

        System.out.println("Can tow up to " + this.towCapacity + " tons");
    }
}