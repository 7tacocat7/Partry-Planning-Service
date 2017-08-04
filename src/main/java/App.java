import Events.Event;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        HashMap<String, Integer> foodAndPrice = new HashMap<String, Integer>();

        foodAndPrice.put("dessert", 125);
        foodAndPrice.put("mexican food", 300);
        foodAndPrice.put("pizza",250 );
        foodAndPrice.put("cheese plate", 400);
        foodAndPrice.put("cajun food", 350);
        foodAndPrice.put("BBQ", 300);
        foodAndPrice.put("thai food", 250);
        foodAndPrice.put("greek cuisine", 375);
        foodAndPrice.put("chinese food", 250);
        foodAndPrice.put("indian food", 275);
        foodAndPrice.put("italian cuisine", 350);

        HashMap<Integer, Integer> guestsAndPrice = new HashMap<Integer, Integer>();
        guestsAndPrice.put(50,150);
        guestsAndPrice.put(100,350);
        guestsAndPrice.put(200,700);

        HashMap<String, Integer> beverageAndPrice = new HashMap<String, Integer>();
        beverageAndPrice.put("open bar",1000);
        beverageAndPrice.put("soda",50);
        beverageAndPrice.put("free drink token",150);
        beverageAndPrice.put("wine",400);
        beverageAndPrice.put("beer",300);

        HashMap<String, Integer> entertainmentAndPrice = new HashMap<String, Integer>();
        entertainmentAndPrice.put("karaoke", 150);
        entertainmentAndPrice.put("trivia", 75);
        entertainmentAndPrice.put("Guest Speaker",120);
        entertainmentAndPrice.put("live band",200);
        entertainmentAndPrice.put("Dj",100);
        entertainmentAndPrice.put("comedy show", 100);





        Event birthdayParty = new Event(30,"dessert", "Open bar","karaoke");
        Event wedding = new Event(200, "mexican food","Open bar", "Live band");
        Event  workParty = new Event (70,"pizza","free drink token", "trivia");
        Event artShow = new Event(100,"Cheese plate","Wine", "Guest Speaker");

        ArrayList<Event> allEvents = new ArrayList<Event>();
        allEvents.add(birthdayParty);
        allEvents.add(wedding);
        allEvents.add(workParty);
        allEvents.add(artShow);







    }
}

