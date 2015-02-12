package za.ac.cput.Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
public class testFail {
    @Before
    public void testBefore()
    {
        System.out.println("in before class (Truth)");
    }
    @Test
    public void Fail()
    {
        TestApp test = new TestApp();
        Assert.fail("This test failed");
    }
    @After
    public void testAfter()
    {
        System.out.println("in after class (Truth)");
    }
}