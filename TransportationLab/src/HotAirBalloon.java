public class HotAirBalloon extends AirTransportation{
    private boolean isWickerBasket;
    private float balloonSize;

    public HotAirBalloon(){
        return;
    }
    public HotAirBalloon(float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                         int rentalPeriodDays, String travelInstructions, float maxHeight, float ascentRate,
                         float descentRate, boolean isWickerBasket, float balloonSize){
        super(price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions, maxHeight,
                ascentRate, descentRate);
        this.isWickerBasket = isWickerBasket;
        this.balloonSize = balloonSize;

    }
    public boolean isWickerBasket() {
        return isWickerBasket;
    }

    public void setWickerBasket(boolean wickerBasket) {
        isWickerBasket = wickerBasket;
    }

    public float getBalloonSize() {
        return balloonSize;
    }

    public void setBalloonSize(float balloonSize) {
        this.balloonSize = balloonSize;
    }

    @Override
    public String toString(){
        String transStr = super.toString();
        transStr += String.format("%nWicker Basket: %-15b Balloon Size: %-15.2f", this.isWickerBasket, this.balloonSize);
        return transStr;
    }
}
