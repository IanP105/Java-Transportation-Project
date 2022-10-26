public class WaterTransportation extends Transportation{

    private int crewmatesNeeded;
    private int totalWeight;
    private float distanceFromCoast;

    public WaterTransportation() {};

    public WaterTransportation(float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                               int rentalPeriodDays, String travelInstructions, int crewmatesNeeded,
                               int totalWeight, float distanceFromCoast) {
        super(price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions);
        this.crewmatesNeeded = crewmatesNeeded;
        this.totalWeight = totalWeight;
        this.distanceFromCoast = distanceFromCoast;
    };

    public int getCrewmatesNeeded() {return crewmatesNeeded;}
    public int getTotalWeight() {return totalWeight;}
    public float getDistanceFromCoast() {return distanceFromCoast;}

    public void setCrewmatesNeeded(int crewmatesNeeded) {this.crewmatesNeeded = crewmatesNeeded;}
    public void setTotalWeight(int totalWeight) {this.totalWeight = totalWeight;}
    public void setDistanceFromCoast(float distanceFromCoast) {this.distanceFromCoast = distanceFromCoast;}

    @Override
    public String toString() {
        String transStr = super.toString();
        transStr += String.format("%nCrewmates Needed: %-15.2s Total Weight: %-15.2s Distance from Coast: %-15.2f",
                crewmatesNeeded, totalWeight, distanceFromCoast);
        return transStr;
    }
}
