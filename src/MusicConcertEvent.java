public class MusicConcertEvent {
    private boolean merchandiseRequired;
    private double merchandiseCost;

    // Constructor
    public MusicConcertEvent(boolean merchandiseRequired, double merchandiseCost) {
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    // Method to calculate the event cost
    public double calculateEventCost() {
        double eventCost = 0.0;
        // Add any additional costs or calculations depending on your requirements
        // For example, if there are ticket costs or additional services
        // eventCost += ticketCost;

        if (merchandiseRequired) {
            eventCost += merchandiseCost;
        }
        
        return eventCost;
    }

    // toString() method to display the details of the concert event
    @Override
    public String toString() {
        return "Music Concert Event: " +
                "Merchandise Required: " + merchandiseRequired +
                ", Merchandise Cost: " + merchandiseCost;
    }
}