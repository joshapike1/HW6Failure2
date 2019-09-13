import java.text.DecimalFormat;

public class Vehicle {

    // Fields
    private String makeAndModel;
    private int year;
    private int MSRP;
    private int mpg;
    private boolean is4WD;

    // Constructors
    public Vehicle(String makeAndModel, int year, boolean is4WD, int MSRP,
                   int mpg) {
        this.makeAndModel = makeAndModel;
        this.year = year;
        this.is4WD = is4WD;
        this.MSRP = MSRP;
        this.mpg = mpg;
    }

    // Getters
    public String getMakeAndModel() {
        return (this.makeAndModel);
    }

    public int getYear() {
        return (this.year);
    }

    public boolean getIs4WD() {
        return (this.is4WD);
    }

    public int getMSRP() {
        return (this.MSRP);
    }

    public int getMpg() {
        return (this.mpg);
    }

    // Setters
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIs4WD(boolean is4WD) {
        this.is4WD = is4WD;
    }

    public void setMSRP(int MSRP) {
        this.MSRP = MSRP;
    }

    public void setMpg(int MPG) {
        this.mpg = MPG;
    }

    // Print statement that is overwritten
    public void printVehicle() {
        System.out.println(getYear() + " " + getMakeAndModel());

        if (getIs4WD() == true) System.out.println("4WD");
        else System.out.println("2WD");

        DecimalFormat format = new DecimalFormat("#,###");
        System.out.println("$" + format.format(getMSRP()));
        System.out.println(getMpg() + "MPG");
    }
}