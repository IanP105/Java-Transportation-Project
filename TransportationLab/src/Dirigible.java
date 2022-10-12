public class Dirigible extends AirTransportation{

    private float airMassContained;
    private String airType;

    public Dirigible(){
        return;
    }
    public Dirigible(int price, String name, int numPassengers, float avgSpeed, boolean isRental,
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
}
