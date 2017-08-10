import Events.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Event birthdayParty = new Event("Your Birthday", 50,"dessert", "open bar","karaoke","");
        Event wedding = new Event("Your wedding", 200, "bbq", "open bar", "live band","");
        Event workParty = new Event("Your work party", 100, "thai food", "free drink token", "guest speaker","");
        Event artShow = new Event ("Your artshow",50, "cheese plate","wine","none","");

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
                        System.out.println("-----------------------------------------------");
                        System.out.println(individualEvent.getName());
                        System.out.println(individualEvent.getGuests());
                        System.out.println(individualEvent.getFood());
                        System.out.println(individualEvent.getBeverage());
                        System.out.println(individualEvent.getEntertainment());
                    } else if (navigationChoice.equalsIgnoreCase("create event")) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Alright, lets create your custom event! What is the event for? Example; Brians artshow, Rachel's wedding, Intel work party");
                    String nameOption = bufferedReader.readLine().toLowerCase();
                    System.out.println("-----------------------------------------------");
                    System.out.println("if you have a coupon code please enter it now to receive  a 100 dollar discount on your food option or 150 dollar discount on your Entertainment option! If you don't have one press enter to continue.");
                    String couponCode = bufferedReader.readLine().toLowerCase();
                    System.out.println("-----------------------------------------------");
                    System.out.println(" Roughly how many guests will be attending this event? options include: 50 ,100, 200 ");
                    Integer numberOfGuests = Integer.parseInt(bufferedReader.readLine());

                    System.out.println("-----------------------------------------------");
                    System.out.println("Noted! What food option would you like? Options include: dessert, mexican food, pizza, cheese plate, cajun food, BBQ, thai food, greek cuisine, chinese food, indian food, or italian cuisine. ");
                    String foodOtion = bufferedReader.readLine().toLowerCase();
                    System.out.println("-----------------------------------------------");
                    System.out.println(" All events include bar service. Unless specified otherwise, drinks from the bar are à la carte! What beverage option would you like? Options include: open bar, soda, free drink token, wine, or beer.");
                    String beverageOption = bufferedReader.readLine().toLowerCase();
                    System.out.println("-----------------------------------------------");
                    System.out.println("Great! Lastly, what entertainment option would you like to book for your event? Options include: karaoke, trivia, guest speaker, live band, Dj, comedy show, or none");
                    String entertainmentOption = bufferedReader.readLine().toLowerCase();

                    Event userCreatedEvent = new Event (nameOption,numberOfGuests,foodOtion,beverageOption,entertainmentOption, couponCode);
                    userCreatedEvent.setCostofGuest(numberOfGuests);
                    userCreatedEvent.setCostofFood(foodOtion);
                    userCreatedEvent.setCostofBeverage(beverageOption);
                    userCreatedEvent.setCostofEntertainment(entertainmentOption);
                    userCreatedEvent.setDiscountOfCouponCode(couponCode);
                    System.out.println("-----------------------------------------------");
                    System.out.println("Okay, here is your new Event!");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Name of event: " + userCreatedEvent.getName());
                    System.out.println("number guests: " + userCreatedEvent.getGuests());
                    System.out.println("Food option: " + userCreatedEvent.getFood());
                    System.out.println("Beverage option: " + userCreatedEvent.getBeverage());
                    System.out.println("Entertainment option: " + userCreatedEvent.getEntertainment());
                    System.out.println("Total price of event: " + "$" + userCreatedEvent.getPrice()+".00");
                    allEvents.add(userCreatedEvent);



                } else if (navigationChoice.equalsIgnoreCase("exit")) {
                    System.out.println("See you next time!");
                    programRunning = false;
                } else {
                    System.out.println("Sorry we did not recognize your navigation choice, would you mind typing that again?");
                }







            } catch (IOException e) {
                e.printStackTrace();
            }


        }







    }
}

