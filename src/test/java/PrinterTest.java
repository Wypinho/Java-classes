import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void can_check_remaining_sheets() {
        assertEquals(5, printer.getSheets());
    }

}
