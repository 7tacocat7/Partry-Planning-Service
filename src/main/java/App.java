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
            System.out.println("-----------------------------------------------\nWelcome to Canales Party planning specialists!\nWhat would you like to do?\nEnter one of the following options:\n-----------------------------------------------\nall events, create event, or exit\n-----------------------------------------------");

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
                    System.out.println("Alright, lets create your custom event!\nWhat is the event for?\nExample: Brians artshow, Rachel's wedding, \nIntel work party");
                    String nameOption = bufferedReader.readLine().toLowerCase();
                    System.out.println("-----------------------------------------------");
                    System.out.println("if you have a coupon code, please enter it now \nto receive a 100 dollar discount on your food\noption,or 150 dollar discount on your Entertainment\n option!\nIf you don't have one press enter to continue.");
                    String couponCode = bufferedReader.readLine().toLowerCase();
                    System.out.println("-----------------------------------------------");
                    System.out.println("Roughly how many guests will be attending this\nevent?\nPlease enter a number.\nOptions include:\n-----------------------------------------------\n50 ,100, 200\n----------------------------------------------- ");
                    Integer numberOfGuests = Integer.parseInt(bufferedReader.readLine());

                    System.out.println("-----------------------------------------------");
                    System.out.println("Noted!\nWhat food option would you like?\nOptions include:\n-----------------------------------------------\ndessert, mexican food, pizza, cheese plate,\ncajun food, BBQ, thai food, greek cuisine,\nchinese food, indian food, or italian cuisine.\n----------------------------------------------- ");
                    String foodOtion = bufferedReader.readLine().toLowerCase();
                    System.out.println("-----------------------------------------------");
                    System.out.println("All events include bar service.\nUnless specified otherwise, drinks from the bar\nare à la carte!\nWhat beverage option would you like?\nOptions include:\n-----------------------------------------------\nopen bar, soda, free drink token,\nwine, or beer.\n-----------------------------------------------");
                    String beverageOption = bufferedReader.readLine().toLowerCase();
                    System.out.println("-----------------------------------------------");
                    System.out.println("Great!\nLastly, what entertainment option would you like\nto book for your event?\nOptions include:\n-----------------------------------------------\n karaoke, trivia, guest speaker, live band, Dj, \ncomedy show, or none\n-----------------------------------------------");
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
                    System.out.println("\n\n\n\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
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

