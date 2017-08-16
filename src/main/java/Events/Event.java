

package Events;


import java.util.HashMap;

public class Event {
    private String name;
    private int guests ;
    private String food;
    private String beverage;
    private String entertainment;
    private String coupon;
    private int price;


//constructor
    public Event(String name, int guests, String food, String beverage, String entertainment,String coupon) {
        this.name = name;
        this.guests = guests;
        this.food = food;
        this.beverage = beverage;
        this.entertainment = entertainment;
        this.coupon = coupon;

    }
//    getters
    public String getName() {
        return name;
    }
    public int getGuests() {
        return guests;
    }
    public String getFood() {
        return food;
    }
    public String getBeverage() {
        return beverage;
    }
    public String getEntertainment() {
        return entertainment;
    }
    public int getPrice() {
        return price;
    }

//    methods to get inputs of users and calculate total cost

    public void setCostofGuest(int input) {
        Integer userInputGuestAndPrice = guestsAndPrice.get(input);
        if (input <= 49){
            this.price = price +100;
        }else if ( input < 99 && input != 50) {
            this.price = price + 330;
        }else if (input <= 199 && input != 100){this.price += 600;
        } else if (input <= 1000 && input != 200){
            this.price += 1000;
        }
//        if (userInputGuestAndPrice == null)  {

    }
    public void setCostofFood(String input) {
        Integer userInputFoodAndPrice = foodAndPrice.get(input);
        if (userInputFoodAndPrice == null) {
            this.food = "no food option";
            this.price += 0;
        }else { this.price += userInputFoodAndPrice;}

    }
      public void setCostofBeverage(String input) {
        Integer userInputBeverageAndPrice = beverageAndPrice.get(input);
      if (userInputBeverageAndPrice == null) {
          this.beverage = "no beverage option";
          this.price += 0;
      }else { this.price += userInputBeverageAndPrice;}
}
    public void setCostofEntertainment(String input) {
        Integer userInputEntertainmentAndPrice = entertainmentAndPrice.get(input);
        if (userInputEntertainmentAndPrice == null) {
            this.entertainment = "no entertainment option";
            this.price += 0;
        }else { this.price += userInputEntertainmentAndPrice;}
    }
    public void setDiscountOfCouponCode(String input) {
        Integer userInputDiscountCode = couponAndPrice.get(input);
        if (userInputDiscountCode == null){
            this.price = price - 0;
        }else {this.price = price - userInputDiscountCode;}
    }

//Hashmap banks to store key value pairs for calculation
    HashMap<String, Integer> foodAndPrice = new HashMap<String, Integer>();{
        foodAndPrice.put("dessert", 125);
        foodAndPrice.put("mexican food", 300);
        foodAndPrice.put("pizza", 250);
        foodAndPrice.put("cheese plate", 400);
        foodAndPrice.put("cajun food", 350);
        foodAndPrice.put("bbq", 300);
        foodAndPrice.put("thai food", 250);
        foodAndPrice.put("greek cuisine", 375);
        foodAndPrice.put("chinese food", 250);
        foodAndPrice.put("indian food", 275);
        foodAndPrice.put("italian cuisine", 350);
    }
    HashMap<Integer, Integer> guestsAndPrice = new HashMap<Integer, Integer>();{
        guestsAndPrice.put(50, 150);
        guestsAndPrice.put(100, 350);
        guestsAndPrice.put(200, 700);
}


    HashMap<String, Integer> beverageAndPrice = new HashMap<String, Integer>();{
        beverageAndPrice.put("open bar", 1000);
        beverageAndPrice.put("soda", 50);
        beverageAndPrice.put("free drink token", 150);
        beverageAndPrice.put("wine", 400);
        beverageAndPrice.put("beer", 300);
}


    HashMap<String, Integer> entertainmentAndPrice = new HashMap<String, Integer>();{
        entertainmentAndPrice.put("karaoke", 150);
        entertainmentAndPrice.put("trivia", 75);
        entertainmentAndPrice.put("guest speaker",120);
        entertainmentAndPrice.put("live band",200);
        entertainmentAndPrice.put("dj",100);
        entertainmentAndPrice.put("comedy show", 100);
        entertainmentAndPrice.put("none", 0);
}
    HashMap<String, Integer>couponAndPrice = new HashMap< String, Integer>();{
        couponAndPrice.put("turntable",150);
        couponAndPrice.put("grill", 100);
    }


}

