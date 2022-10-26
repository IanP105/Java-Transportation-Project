public class LandTransportation extends Transportation {
    private String departureLocation;
    private String arrivalLocation;
    private String accommodation;

    public LandTransportation() {
        return;
    }

    public LandTransportation(float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                             int rentalPeriodDays, String travelInstructions, String departureLocation, String arrivalLocation,
                             String accommodation) {
        super(price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions);
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.accommodation = accommodation;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    @Override
    public String toString() {
        String transStr = super.toString();
        transStr += String.format("%nDepartureLocation: %-15s ArrivalLocation: %-15s Accomodation: %-15s", departureLocation,
                arrivalLocation, accommodation);
        return transStr;
    }
}
