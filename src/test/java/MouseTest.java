import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        this.mouse = new Mouse("wireless");
    }


    @Test
    public void canInputData(){
        assertEquals("squeek", mouse.sendData("squeek"));
    }

    @Test
    public void canClick(){
        assertEquals("CLICK", mouse.click());
    }

}
