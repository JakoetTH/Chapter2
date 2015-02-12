package za.ac.cput.Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
public class testNotNullness {
    @Before
    public void testBefore()
    {
        System.out.println("in before class (Truth)");
    }
    @Test
    public void NotNullness()
    {
        TestApp test = new TestApp();
        Assert.assertNotNull("This object is null",test.generateNull(""));
    }
    @After
    public void testAfter()
    {
        System.out.println("in after class (Truth)");
    }
}