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
        Event testEvent = new Event("carson", 50,"mexican food","wine","dj", "grill");
        assertEquals(100,testEvent.getName());
    }
}