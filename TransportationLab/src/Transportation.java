public class Transportation {
    private float price;
    private String name;
    private int numPassengers;
    private float avgSpeed;
    private boolean isRental;
    private int rentalPeriodDays;
    private String travelInstructions;

    public Transportation(){
        return;
    }
    public Transportation(float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                          int rentalPeriodDays, String travelInstructions){
        this.price = price;
        this.name = name;
        this.numPassengers = numPassengers;
        this.avgSpeed = avgSpeed;
        this.isRental = isRental;
        this.rentalPeriodDays = rentalPeriodDays;
        this.travelInstructions = travelInstructions;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public float getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(float avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public boolean getIsRental() {
        return isRental;
    }

    public void setIsRental(boolean rental) {
        isRental = rental;
    }

    public int getRentalPeriodDays() {
        return rentalPeriodDays;
    }

    public void setRentalPeriodDays(int rentalPeriodDays) {
        this.rentalPeriodDays = rentalPeriodDays;
    }

    public String getTravelInstructions() {
        return travelInstructions;
    }

    public void setTravelInstructions(String travelInstructions) {
        this.travelInstructions = travelInstructions;
    }

    @Override
    public String toString(){
        String str = "Name: %-15s Price: $%-15.2f Max Passengers: %-15d%nAvg. Speed: %-15.2f Is Rental: %-15b Rental Period: %-15d%nTravel Instructions: %-15s";
        return String.format(str, name, price, numPassengers, avgSpeed,
                isRental, rentalPeriodDays, travelInstructions);

    }
}

