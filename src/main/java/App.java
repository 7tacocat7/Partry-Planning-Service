import Events.Event;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Event birthdayParty = new Event(30,"cake", "Open bar","karaoke");
        Event wedding = new Event(200, "mexican","Open bar", "Live band");
        Event  workParty = new Event (70,"pizza","free drink token", "trivia");
        Event artShow = new Event(100,"Cheese plate","Wine", "Guest Speaker");

        ArrayList<Event> allEvents = new ArrayList<Event>();
        allEvents.add(birthdayParty);
        allEvents.add(wedding);
        allEvents.add(workParty);
        allEvents.add(artShow);







    }
}

