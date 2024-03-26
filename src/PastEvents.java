import java.time.LocalDate;

public class PastEvents extends Event {
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    @SuppressWarnings("unused")
    private String paymentStatus;
    @SuppressWarnings("unused")
    private boolean requiresExtension;
    private static final double eventCost = 10_000;
    private String paymentDetails;
    
    public PastEvents(String eventName, LocalDate eventStartDate, LocalDate eventEndDate, String paymentStatus, boolean requiresExtension) {
        
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
        this.paymentDetails = "The event cost was " + eventCost + " and the payment status is " + paymentStatus + 
            ". The Customer requires extension?: " + requiresExtension + ".";
    }
    
    public String toString() {
        return super.toString() + "\nEvent Start Date: " + eventStartDate + "\nEvent End Date: " + eventEndDate +
            "\nPayment Details: " + paymentDetails;
    }
    
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2022, 1, 5);
        PastEvents event = new PastEvents("Example Event", startDate, endDate, "Paid", false);
        
        System.out.println(event);
        // Calling paymentDetails() method
        event.paymentDetails();
    }

    private void paymentDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'paymentDetails'");
    }

    @Override
    public void calculateEventCost() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateEventCost'");
    }
}