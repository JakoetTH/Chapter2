package za.ac.cput.Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
public class testArray {
    @Before
    public void testBefore()
    {
        System.out.println("in before class (Equality)");
    }
    @Test
    public void Arr()
    {
        TestApp test = new TestApp();
        String [] arr = new String[5];
        Assert.assertArrayEquals(arr,test.generateArray());
    }
    @After
    public void testAfter()
    {
        System.out.println("in after class (Equality)");
    }
}