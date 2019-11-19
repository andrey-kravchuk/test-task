import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SizeObjectTest {

    private int id;
    private float sizeX;
    private float sizeY;
    private float sizeZ;
    private Box box;

    @Before
    public void setUp() throws Exception {
        id = 1;
        sizeX = 2;
        sizeY = 3;
        sizeZ = 4;
        box = new Box(id, sizeX, sizeY, sizeZ);
    }

    @Test
    public void volume() {
        float result = 24;
        assertTrue(box.volume() == result);
    }
}