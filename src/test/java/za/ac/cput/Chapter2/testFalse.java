package za.ac.cput.Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
public class testFalse {
    @Before
    public void testBefore()
    {
        System.out.println("in before class (Truth)");
    }
    @Test
    public void False()
    {
        TestApp test = new TestApp();
        Assert.assertFalse("This test is true",test.generateBoolean(true));
    }
    @After
    public void testAfter()
    {
        System.out.println("in after class (Truth)");
    }
}
