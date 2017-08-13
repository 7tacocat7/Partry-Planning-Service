import static org.junit.Assert.*;

import Events.Event;
import org.junit.Test;



public class AppTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception{
        Event testEvent = new Event("Carsons birthday",50,"thai food","open bar","live band", "");
        assertEquals(true, testEvent instanceof  Event);
    }
    @Test
    public void newEvent_getsName_carson(){
        Event testEvent = new Event("carson", 100,"mexican food","wine","dj", "grill");
        assertEquals("carson",testEvent.getName());
    }
    @Test
    public void newEvent_getsGuest_100(){
        Event testEvent1 = new Event("carson", 100,"mexican food","wine","dj", "grill");
        assertEquals(100,testEvent1.getGuests());
    }
    @Test
    public void newEvent_getsFood_MexicanFood(){
        Event testEvent2 = new Event("carson", 100,"mexican food","wine","dj", "grill");
        assertEquals("mexican food",testEvent2.getFood());
    }
    @Test
    public void newEvent_getsBeverage_Wine(){
        Event testEvent3 = new Event("carson", 100,"mexican food","wine","dj", "grill");
        assertEquals("wine",testEvent3.getBeverage());
    }
    @Test
    public void newEvent_getsEntertainment_Dj(){
        Event testEvent4 = new Event("carson", 100,"mexican food","wine","dj", "grill");
        assertEquals("dj",testEvent4.getEntertainment());
    }
    @Test
    public void newEvent_getsPrice_0(){
        Event testEvent5 = new Event("carson", 100,"mexican food","wine","dj", "grill");
        assertEquals(0,testEvent5.getPrice());
    }
    @Test
    public void setCostofGuest_700(){
        Event testEvent6 = new Event("carson", 200,"mexican food","wine","dj", "grill");
        testEvent6.setCostofGuest(200);
        assertEquals(700,testEvent6.getPrice());
    }
    @Test
    public void setCostofFood_300(){
        Event testEvent7 = new Event("carson", 200,"mexican food","wine","dj", "grill");
        testEvent7.setCostofFood("mexican food");
        assertEquals(300,testEvent7.getPrice());
    }
}