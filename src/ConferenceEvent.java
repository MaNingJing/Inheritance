public class ConferenceEvent {
    private double breakfastCost;
    private boolean breakfastRequired;
    private double lunchCost;
    private boolean lunchRequired;
    private double dinnerCost;
    private boolean dinnerRequired;
    private double conferenceEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String poingOfString;
    private int totalParticipants;
    private int totalEventDays;
    private double eventCost;
    private CalculateEventCostClass calculateEventCostObject;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double conferenceEventCost, double eventCost, int totalParticipants, int totalEventDays,boolean breakfastRequired, double breakfastCost, boolean lunchRequired, double lunchCost,  boolean dinnerRequired, double dinnerCost){
   
    this.eventID = eventID;
    this.eventName = eventName;
    this.eventLocation = eventLocation;
    this.breakfastCost = breakfastCost;
    this.lunchCost = lunchCost;
    this.dinnerCost = dinnerCost;
    this.eventCost = eventCost;
    this.calculateEventCostObject = new CalculateEventCostClass();
}
    

    public boolean isBreakfastRequired() {
        return breakfastRequired;
    }


    public void setBreakfastRequired(boolean breakfastRequired) {
        this.breakfastRequired = breakfastRequired;
    }


    public boolean isLunchRequired() {
        return lunchRequired;
    }


    public void setLunchRequired(boolean lunchRequired) {
        this.lunchRequired = lunchRequired;
    }


    public boolean isDinnerRequired() {
        return dinnerRequired;
    }


    public void setDinnerRequired(boolean dinnerRequired) {
        this.dinnerRequired = dinnerRequired;
    }


    public double getConferenceEventCost() {
        return conferenceEventCost;
    }


    public void setConferenceEventCost(double conferenceEventCost) {
        this.conferenceEventCost = conferenceEventCost;
    }


    public String getEventID() {
        return eventID;
    }


    public void setEventID(String eventID) {
        this.eventID = eventID;
    }


    public String getEventName() {
        return eventName;
    }


    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    public String getEventLocation() {
        return eventLocation;
    }


    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }


    public String getPoingOfString() {
        return poingOfString;
    }


    public void setPoingOfString(String poingOfString) {
        this.poingOfString = poingOfString;
    }


    public int getTotalParticipants() {
        return totalParticipants;
    }


    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }


    public int getTotalEventDays() {
        return totalEventDays;
    }


    public void setTotalEventDays(int totalEventDays) {
        this.totalEventDays = totalEventDays;
    }


    public CalculateEventCostClass getCalculateEventCostObject() {
        return calculateEventCostObject;
    }


    public void setCalculateEventCostObject(CalculateEventCostClass calculateEventCostObject) {
        this.calculateEventCostObject = calculateEventCostObject;
    }


    public double getBreakfastCost() {
       return breakfastCost;
   }

   public void setBreakfastCost(double breakfastCost) {
       this.breakfastCost = breakfastCost;
   }

   

   public double getLunchCost() {
       return lunchCost;
   }

   public void setLunchCost(double lunchCost) {
       this.lunchCost = lunchCost;
   }

   

   public double getDinnerCost() {
       return dinnerCost;
   }

   public void setDinnerCost(double dinnerCost) {
       this.dinnerCost = dinnerCost;
   }

   
   public double geteventCost() {
    return eventCost;
}

    public void seteventCost(double eventCost) {
    this.eventCost = eventCost;
}


    public void calculateEventCost(){
        eventCost = calculateEventCostObject.calculateEventCost() + 
        (calculateEventCostObject.calculateEventCost() * 0.3);
    }

    @Override
    public String toString(){
    return "Conference Event details: " + "\n" +
    "Event ID: " + eventID + "\n" +
    "Event Name: " + eventName + "\n" +
    "Event Location: " + eventLocation + "\n" +
    "Total participants: " + totalParticipants + "\n" +
    "Total Conference Cost: " + conferenceEventCost;
    }


}