

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
    public void setName(String name) {
        this.name = name;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getBeverage() {
        return beverage;
    }
    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }
    public String getEntertainment() {
        return entertainment;
    }
    public void setEntertainment(String entertainment) {
        this.entertainment = entertainment;
    }
    public String getCoupon() {
        return coupon;
    }
    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

//    methods to get inputs of users and calculate total cost

    public void setCostofGuest(int input) {
        Integer userInputGuestAndPrice = guestsAndPrice.get(input);
        this.price += + userInputGuestAndPrice;
    }
    public void setCostofFood(String input) {
        Integer userInputFoodAndPrice = foodAndPrice.get(input);
        this.price += + userInputFoodAndPrice;
    }
      public void setCostofBeverage(String input) {
        Integer userInputBeverageAndPrice = beverageAndPrice.get(input);
        this.price += + userInputBeverageAndPrice;
    }
    public void setCostofEntertainment(String input) {
        Integer userInputEntertainmentAndPrice = entertainmentAndPrice.get(input);
        this.price += + userInputEntertainmentAndPrice;
    }
    public void setDiscountOfCouponCode(String input) {
        userInputCouponCode.equals(couponCode);
        this.price -= price*.3;
    }
        String couponCode = "Carson";
         String userInputCouponCode;

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

//    String userInputVariableFoodAndPrice = foodAndPrice.get();
//    Integer userInputGuestAndPrice = guestsAndPrice.get();
////    public Integer eventCost (Event chosenEvent)

}

