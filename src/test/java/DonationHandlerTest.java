import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DonationHandlerTest {
    @Test
    public void setNext_works() {
        DonationHandler handler1 = new DonationHandler();
        DonationHandler handler2 = new DonationHandler();

        DonationHandler result = handler1.setNext(handler2);

        assertEquals(handler2,result);
        assertEquals(handler2,handler1.nextHandler);
    }
}
