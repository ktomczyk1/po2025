import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void missingChar() {
        assertEquals("ktten", new CodingBat().missingChar("kitten", 1));
        assertEquals("itten", new CodingBat().missingChar("kitten", 0));
        assertEquals("kittn", new CodingBat().missingChar("kitten", 4));
    }

    @Test
    public void or35() {
        assertEquals(true, new CodingBat().or35(3));
        assertEquals(true, new CodingBat().or35(10));
        assertEquals(false, new CodingBat().or35(8));
    }

    @Test
    public void bigDiff() {
        assertEquals(7, new CodingBat().bigDiff(new int[]{10,3,5,6}));
        assertEquals(8, new CodingBat().bigDiff(new int[]{7,2,10,9}));
        assertEquals(8, new CodingBat().bigDiff(new int[]{2,10,7,2}));
    }

    @Test
    public void atFirst() {
        assertEquals("he", new CodingBat().atFirst("hello"));
        assertEquals("hi", new CodingBat().atFirst("hi"));
        assertEquals("h@", new CodingBat().atFirst("h"));
    }
}