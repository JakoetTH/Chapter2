package za.ac.cput.Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
public class testTruth {
    @Before
    public void testBefore()
    {
        System.out.println("in before class (Truth)");
    }
    @Test
    public void Truth()
    {
        TestApp test = new TestApp();
        Assert.assertTrue("This test is false",test.generateBoolean(false));
    }
    @After
    public void testAfter()
    {
        System.out.println("in after class (Truth)");
    }
}
