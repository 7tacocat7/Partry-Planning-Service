

package Events;


import java.util.HashMap;

public class Event {
    public String name;
    public int guests = 0;
    public String food;
    public String beverage;
    public String entertainment;
    public String coupon;



//constructor
    public Event(String name, int guests, String food, String beverage, String entertainment,String coupon) {
        this.name = name;
        this.guests = guests;
        this.food = food;
        this.beverage = beverage;
        this.entertainment = entertainment;
        this.coupon = coupon;



    }

    public static void calculateCostOfEvent(){
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


    }


//    public Integer eventCost (Event chosenEvent)

}

