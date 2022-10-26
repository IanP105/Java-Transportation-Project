public class Submarine extends WaterTransportation{
    private float divingDepth;
    private float maxPSI;
    private String type;

    public Submarine () {};
    public Submarine (float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                 int rentalPeriodDays, String travelInstructions, Integer crewmatesNeeded,
                 Integer totalWeight, Float distanceFromCoast, float divingDepth,
                 float maxPSI, String type) {
        super (price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions, crewmatesNeeded, totalWeight, distanceFromCoast);
        this.divingDepth = divingDepth;
        this.maxPSI = maxPSI;
        this.type= type;
    }
    public float getDivingDepth() {return divingDepth;}
    public float getMaxPSI() {return maxPSI;}
    public String getType() {return type;}

    public void setDivingDepth(float divingDepth) {this.divingDepth = divingDepth;}
    public void setMaxPSI(float maxPSI) {this.maxPSI = maxPSI;}
    public void setType(String type) {this.type = type;}

    @Override
    public String toString() {
        String transStr = super.toString();
        transStr += String.format("%nDiving Depth: %-15f Max PSI: %-15f Type: %-15s", this.divingDepth, this.maxPSI, this.type);
        return transStr;
    }
}