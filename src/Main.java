

public class Main {
    
    public static void main(String[] args) {
        ConferenceEvent conferenceEvent=new ConferenceEvent("derfs", "43", "fgvd", "dfs", 0, 0, 0, 0,true, 0,true, 0,true,0);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);

        MusicConcertEvent musicConcertEvent=new MusicConcertEvent("E001", "rofd", "df", "fsdf", 0, 0, 0, false, 0);
        musicConcertEvent.calculateEventCost();
        System.out.println(musicConcertEvent);

    }
}
