import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void has_volume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drink_method_reduces_volume_by_10(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void can_empty_bottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

}
