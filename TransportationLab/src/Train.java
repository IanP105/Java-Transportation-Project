public class Train extends LandTransportation{
    private String travelLuxury;
    private boolean layover;
    private String layoverLocation;

    public Train(){
        return;
    }

    public Train(float price, String name, int numPassengers, float avgSpeed, boolean isRental,
    int rentalPeriodDays, String travelInstructions, String departureLocation, String arrivalLocation, String accommodation, String travelLuxury, boolean layover, String layoverLocation){
        super(price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions, departureLocation,
                arrivalLocation, accommodation);
        this.travelLuxury = travelLuxury;
        this.layover = layover;
        this.layoverLocation = layoverLocation;
    }

    public String getTravelLuxury() {
        return travelLuxury;
    }
    public boolean isLayover() {
        return layover;
    }

    public String getLayoverLocation() {
        return layoverLocation;
    }

    public void setTravelLuxury(String travelLuxury) {
        this.travelLuxury = travelLuxury;
    }

    public void setLayover(boolean layover) {
        this.layover = layover;
    }

    public void setLayoverLocation(String layoverLocation) {
        this.layoverLocation = layoverLocation;
    }
    @Override
    public String toString(){
        String transStr = super.toString();
        transStr += String.format("%nTravel Luxury: %-15s Layover: %-15s Layover Location: %-15s", travelLuxury,
                layover, layoverLocation);
        return transStr;
    }
}