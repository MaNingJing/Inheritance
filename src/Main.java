import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {
        ConferenceEvent conferenceEvent=new ConferenceEvent(null, null, null, null, 0, 0, 0, 0, 0, 0);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);

        MusicConcertEvent musicConcertEvent=new MusicConcertEvent(null, null, null, null, 0, 0, 0, false, 0);
        musicConcertEvent.calculateEventCost();
        System.out.println(musicConcertEvent);

        PastEvent pastEvent=new PastEvent(null, null, null, null, 0, 0,LocalDate.of(2023,3,25),LocalDate.of(2023,3,27) , "Paid", false);
       
       System.out.println(pastEvent);


    }
}
