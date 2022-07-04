import static org.junit.Assert.*;

import org.junit.Test;

public class mainrefltest {
    @Test
    public void testgetX() {
        mainrefl r = new mainrefl(5,10,15);
        assertEquals(5,r.getX());
    }
    @Test
    public void testsetX() {
        mainrefl r = new mainrefl();
        r.setX(50);
        assertEquals(50,r.getX());
    }
    @Test
    public void testSqrX() {
        mainrefl r = new mainrefl(5,10,15);
        r.sqrX();
        assertEquals(25,r.getX());
    }
    @Test
    public void testSetYSqrY() {
        mainrefl r = new mainrefl();
        r.setY(40);
        r.sqrY();
        assertEquals(1600,r.getY());
    }
    @Test
    public void testSqr() {
        mainrefl r = new mainrefl(5,10,15);
        r.getX();
        r.getY();
        r.getZ();
        assertEquals("(x:5, y:10, z:15)",r.toString() );
    }




}
