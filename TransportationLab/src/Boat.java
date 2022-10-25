public class Boat extends WaterTransportation{
    private int numberOfSails;
    private int marketPrice;
    private String model;

    public Boat () {};
    public Boat (float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                int rentalPeriodDays, String travelInstructions, Integer crewmatesNeeded,
                 Integer totalWeight, Float distanceFromCoast, Integer numberOfSails,
                Integer marketPrice, String model) {
        super (price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions, crewmatesNeeded, totalWeight, distanceFromCoast);
        this.numberOfSails = numberOfSails;
        this.marketPrice = marketPrice;
        this.model = model;
    }
    public int getNumberOfSails() {return numberOfSails;}
    public int getMarketPrice() {return marketPrice;}
    public String getModel() {return model;}

    public void setNumberOfSails(int numberOfSails) {this.numberOfSails = numberOfSails;}
    public void setMarketPrice(int marketPrice) {this.marketPrice = marketPrice;}
    public void setModel(String model) {this.model = model;}

    @Override
    public String toString() {
        String transStr = super.toString();
        transStr += String.format("%nNumber of Sails: %-15d Market Price: %-15d Model: %-15s", this.numberOfSails, this.marketPrice, this.model);
        return transStr;
    }
}