import static org.junit.Assert.*;

import Events.Event;
import org.junit.Test;



public class AppTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception{
        Event testEvent = new Event("Carsons birthday",50,"thai food","open bar","live band", "");
        assertEquals(true, testEvent instanceof  Event);
    }

}