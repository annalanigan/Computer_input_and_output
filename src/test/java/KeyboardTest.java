import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        this.keyboard = new Keyboard("English");
    }

    @Test
    public void canSendData(){
        assertEquals("I am Typing", keyboard.sendData("I am Typing"));
    }


}
