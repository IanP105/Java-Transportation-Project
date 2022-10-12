public class Helicopter extends AirTransportation {
    private int numBlades;
    private String model;

    public Helicopter(){
        return;
    }
    public Helicopter(int price, String name, int numPassengers, float avgSpeed,
                      boolean isRental, int rentalPeriodDays, String travelInstructions,
                      float maxHeight, float ascentRate, float descentRate, int numBlades, String model){
        super(price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions,
                maxHeight, ascentRate, descentRate);
        this.numBlades = numBlades;
        this.model = model;
    }
    public int getNumBlades() {
        return numBlades;
    }

    public void setNumBlades(int numBlades) {
        this.numBlades = numBlades;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
