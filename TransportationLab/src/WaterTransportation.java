public class WaterTransportation extends Transportation{

    private Integer crewmatesNeeded;
    private Integer totalWeight;
    private float distanceFromCoast;

    public WaterTransportation() {};

    public WaterTransportation(float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                               int rentalPeriodDays, String travelInstructions, Integer crewmatesNeeded,
                               Integer totalWeight, Float distanceFromCoast) {
        super(price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions);
        this.crewmatesNeeded = crewmatesNeeded;
        this.totalWeight = totalWeight;
        this.distanceFromCoast = distanceFromCoast;
    };

    public Integer getCrewmatesNeeded() {return crewmatesNeeded;}
    public Integer getTotalWeight() {return totalWeight;}
    public Float getDistanceFromCoast() {return distanceFromCoast;}

    public void setCrewmatesNeeded(Integer crewmatesNeeded) {this.crewmatesNeeded = crewmatesNeeded;}
    public void setTotalWeight(Integer totalWeight) {this.totalWeight = totalWeight;}
    public void setDistanceFromCoast(Float distanceFromCoast) {this.distanceFromCoast = distanceFromCoast;}

    @Override
    public String toString() {
        String transStr = super.toString();
        transStr += String.format("%nCrewmates Needed: %-15.2s Total Weight: %-15.2s Distance from Coast: %-15.2f",
                crewmatesNeeded, totalWeight, distanceFromCoast);
        return transStr;
    }
}
