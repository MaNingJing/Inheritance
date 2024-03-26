import java.time.LocalDate;

public class PastEvent extends Event  {
    @SuppressWarnings("unused")
    private LocalDate eventStartDate;
    @SuppressWarnings("unused")
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private static final double eventCost = 10_000;
  
    
    public PastEvent(String eventID,String eventName,String eventLocation,String pointOfContact,int totalParticipants,int totalEventDays, LocalDate eventStartDate, LocalDate eventEndDate, String paymentStatus, boolean requiresExtension) {
        super(eventID, eventName, eventLocation, pointOfContact, totalEventDays, totalParticipants, totalEventDays);
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
       
    }
    
  
    

    private String getPaymentDetails() {
        return String.format("The event cost was %.2f and the payment status is %s. The Customer requires extension?: &b." ,eventCost, paymentStatus, requiresExtension);
        
    }
    @Override
    public String toString(){
        return "Conference Event details: " + "\n" +
        "Event ID: " + getEventID() + "\n" +
        "Event Name: " + getEventName() + "\n" +
        "Event Location: " + getEventLocation() + "\n" +
        "Total participants: " + getTotalParticipants() + "\n" +
        "The payment details are as follows: " + "\n" + 
        getPaymentDetails();
}

   
    }
