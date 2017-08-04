import static org.junit.Assert.*;

import Events.Event;
import org.junit.Test;



public class AppTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception{
        Event testEvent = new Event (20,"mexican", "open bar", "live band");
        assertEquals(false, testEvent instanceof  Event);
    }

}