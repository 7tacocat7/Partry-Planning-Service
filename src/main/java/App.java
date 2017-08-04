import Events.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        foodAndPrice.put("bbq", 300);
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
        entertainmentAndPrice.put("guest speaker",120);
        entertainmentAndPrice.put("live band",200);
        entertainmentAndPrice.put("dj",100);
        entertainmentAndPrice.put("comedy show", 100);
        entertainmentAndPrice.put("none", 0);





        Event birthdayParty = new Event("Your Birthday", 50,"dessert", "open bar","karaoke");
        Event wedding = new Event("Your wedding", 200, "bbq", "open bar", "live band");
        Event workParty = new Event("Your work party", 100, "thai food", "free drink token", "guest speaker");
        Event artShow = new Event ("Your artshow",50, "cheese plate","wine","none");

        ArrayList<Event> allEvents = new ArrayList<Event>();
        allEvents.add(birthdayParty);
        allEvents.add(wedding);
        allEvents.add(workParty);
        allEvents.add(artShow);

        boolean programRunning = true;

        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
            System.out.println(" Welcome to Canales Party planning specialists! What would you like to do? Enter one of the following options: all events, create event, exit");

            try {
                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equalsIgnoreCase("all events"))
                    for (Event individualEvent : allEvents) {
                        System.out.println("----------------------");
                        System.out.println(individualEvent.name);
                        System.out.println(individualEvent.guests);
                        System.out.println(individualEvent.food);
                        System.out.println(individualEvent.beverage);
                        System.out.println(individualEvent.entertainment);
                    } else if (navigationChoice.equalsIgnoreCase("create event")) {
                    System.out.println("Alright, lets create your custom event! What is the event for? Example; Brians artshow, Rachel's wedding, Intel work party");
                    String nameOption = bufferedReader.readLine().toLowerCase();
                    System.out.println(" Roughly how many guests will be attending? options include: 50 ,100, 200 ");
                    Integer numberOfGuests = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Noted! What food option would you like? Options include: dessert, mexican food, pizza, cheese plate, cajun food, BBQ, thai food, greek cuisine, chinese food, indian food, or italian cuisine. ");
                    String foodOtion = bufferedReader.readLine().toLowerCase();
                    System.out.println(" Okay, What beverage option would you like? Options include: open bar, soda, free drink token, wine, or beer.");
                    String beverageOption = bufferedReader.readLine().toLowerCase();
                    System.out.println("Great! Lastly, what entertainment option would you like to book for your event? Options include: karaoke, trivia, guest speaker, live band, Dj, comedy show, or none");
                    String entertainmentOption = bufferedReader.readLine().toLowerCase();

                    Event userCreatedEvent = new Event (nameOption,numberOfGuests,foodOtion,beverageOption,entertainmentOption);
                    System.out.println("Okay, here is your new Event!");
                    System.out.println("----------------------");
                    System.out.println(userCreatedEvent.name);
                    System.out.println(userCreatedEvent.guests);
                    System.out.println(userCreatedEvent.food);
                    System.out.println(userCreatedEvent.beverage);
                    System.out.println(userCreatedEvent.entertainment);
                    allEvents.add(userCreatedEvent);

                } else if (navigationChoice.equalsIgnoreCase("exit")) {
                    System.out.println("See you next time!");
                    programRunning = false;
                } else {
                    System.out.println("Sorry we did not recognize your navigation choice, would you mind typing that agian?");
                }







            } catch (IOException e) {
                e.printStackTrace();
            }


        }







    }
}

