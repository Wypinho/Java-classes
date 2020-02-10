import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void can_add(){
        assertEquals(5, calculator.add(3,2));
    }

    @Test
    public void can_subtract(){
        assertEquals(2, calculator.subtract(5,3));
    }

    @Test
    public void can_multiply(){
        assertEquals(15, calculator.multiply(3,5));
    }

    @Test
    public void can_divide(){
        assertEquals(3, calculator.divide(15,5));
    }

}
