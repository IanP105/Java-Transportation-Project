public class AirTransportation extends Transportation {

    private float maxHeight;
    private float ascentRate;
    private float descentRate;

    public AirTransportation(){
        return;
    }

    public AirTransportation(float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                             int rentalPeriodDays, String travelInstructions, float maxHeight, float ascentRate,
                             float descentRate){
        super(price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions);
        this.maxHeight = maxHeight;
        this.descentRate = descentRate;
        this.ascentRate = ascentRate;
    }

    public float getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(float maxHeight) {
        this.maxHeight = maxHeight;
    }

    public float getAscentRate() {
        return ascentRate;
    }

    public void setAscentRate(float ascentRate) {
        this.ascentRate = ascentRate;
    }

    public float getDescentRate() {
        return descentRate;
    }

    public void setDescentRate(float descentRate) {
        this.descentRate = descentRate;
    }

    @Override
    public String toString(){
        String transStr = super.toString();
        transStr += String.format("%nMax Height: %-15.2f Ascent Rate: %-15.2f Descent Rate: %-15.2f", maxHeight,
                ascentRate, descentRate);
        return transStr;
    }
}
