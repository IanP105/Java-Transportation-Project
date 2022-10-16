public class Dirigible extends AirTransportation{

    private float airMassContained;
    private String airType;

    public Dirigible(){
        return;
    }
    public Dirigible(float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                     int rentalPeriodDays, String travelInstructions, float maxHeight, float ascentRate,
                     float descentRate, float airMassContained, String airType){
        super(price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions,
                maxHeight, ascentRate, descentRate);
        this.airMassContained = airMassContained;
        this.airType = airType;
    }
    public float getAirMassContained() {
        return airMassContained;
    }

    public void setAirMassContained(float airMassContained) {
        this.airMassContained = airMassContained;
    }

    public String getAirType() {
        return airType;
    }

    public void setAirType(String airType) {
        this.airType = airType;
    }

    @Override
    public String toString(){
        String transStr = super.toString();
        transStr += String.format("%nAir Mass: %-15.2f Air Type: %-15s", this.airMassContained, this.airType);
        return transStr;
    }
}
