public class Transportation {
    private int price;
    private String name;
    private int numPassengers;
    private float avgSpeed;
    private boolean isRental;
    private int rentalPeriodDays;
    private String travelInstructions;

    public Transportation(){
        return;
    }
    public Transportation(int price, String name, int numPassengers, float avgSpeed, boolean isRental,
                          int rentalPeriodDays, String travelInstructions){
        this.price = price;
        this.name = name;
        this.numPassengers = numPassengers;
        this.avgSpeed = avgSpeed;
        this.isRental = isRental;
        this.rentalPeriodDays = rentalPeriodDays;
        this.travelInstructions = travelInstructions;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    public boolean isRental() {
        return isRental;
    }

    public void setRental(boolean rental) {
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
        String str = "%15d%15s%15d%15f%15b%15d%s";
        return String.format(str, price, name, numPassengers, avgSpeed,
                isRental, rentalPeriodDays, travelInstructions);

    }
}

