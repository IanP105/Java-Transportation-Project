public class Automobile extends LandTransportation{
        private String pickupLocation;
        private String dropoffLocation;
        private int seats;

        public Automobile() {return;}

        public Automobile(float price, String name, int numPassengers, float avgSpeed, boolean isRental,
                    int rentalPeriodDays, String travelInstructions, String departureLocation, String arrivalLocation, String accommodation, String pickupLocation, String dropoffLocation, int seats) {
            super(price, name, numPassengers, avgSpeed, isRental, rentalPeriodDays, travelInstructions, departureLocation,
                    arrivalLocation, accommodation);
            this.pickupLocation = pickupLocation;
            this.dropoffLocation = dropoffLocation;
            this.seats = seats;
        }
        public String getDropoffLocation() {
            return dropoffLocation;
        }

        public String getPickupLocation() {
            return pickupLocation;
        }

        public int getSeats() {
            return seats;
        }

        public void setPickupLocation(String pickupLocation) {
            this.pickupLocation = pickupLocation;
        }

        public void setDropoffLocation(String dropoffLocation) {
            this.dropoffLocation = dropoffLocation;
        }

        public void setSeats(int seats) {
            this.seats = seats;
        }
        @Override
        public String toString(){
            String transStr = super.toString();
            transStr += String.format("%nPickup LOcation: %-15s Dropoff Location: %-15s Seats: %-15s",pickupLocation,
                    dropoffLocation, seats);
            return transStr;
        }
}