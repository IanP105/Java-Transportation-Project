public class Ship extends WaterTransportation{
    private int numberOfEngines;
    private int totalHorsepower;
    private float maxCapacity;

    public Ship () {};
    public Ship (float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                 int rentalPeriodDays, String travelInstructions, Integer crewmatesNeeded,
                 Integer totalWeight, Float distanceFromCoast, Integer numberOfEngines,
                 Integer totalHorsepower, float maxCapacity) {
        super (price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions, crewmatesNeeded, totalWeight, distanceFromCoast);
        this.numberOfEngines = numberOfEngines;
        this.totalHorsepower = totalHorsepower;
        this.maxCapacity = maxCapacity;
    }
    public int getNumberOfEngines() {return numberOfEngines;}
    public int getTotalHorsepower() {return totalHorsepower;}
    public float getMaxCapacity() {return maxCapacity;}

    public void setNumberOfEngines(int numberOfEngines) {this.numberOfEngines = numberOfEngines;}
    public void setTotalHorsepower(int totalHorsepower) {this.totalHorsepower = totalHorsepower;}
    public void setMaxCapacity(float maxCapacity) {this.maxCapacity = maxCapacity;}

    @Override
    public String toString() {
        String transStr = super.toString();
        transStr += String.format("%nNumber of Engines: %-15d Total Horsepower: %-15d Max Capacity: %-15f", this.numberOfEngines, this.totalHorsepower, this.maxCapacity);
        return transStr;
    }
}