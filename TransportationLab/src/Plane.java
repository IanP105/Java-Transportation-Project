public class Plane extends AirTransportation{
    private float wingSpan;
    private int numTurbines;
    private String model;

    public Plane(){
        return;
    }
    public Plane(float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                 int rentalPeriodDays, String travelInstructions, float maxHeight, float ascentRate,
                 float descentRate, float wingSpan, int numTurbines, String model){
        super(price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions, maxHeight,
                ascentRate, descentRate);
        this.wingSpan = wingSpan;
        this.numTurbines = numTurbines;
        this.model = model;
    }
    public float getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(float wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getNumTurbines() {
        return numTurbines;
    }

    public void setNumTurbines(int numTurbines) {
        this.numTurbines = numTurbines;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString(){
        String transStr = super.toString();
        transStr += String.format("%nWing Span: %-15.2f Turbine Count: %-15d Mode: %-15s", this.wingSpan, this.numTurbines, this.model);
        return transStr;
    }
}
