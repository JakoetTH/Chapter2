package za.ac.cput.Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
public class testNullness {
    @Before
    public void testBefore()
    {
        System.out.println("in before class (Truth)");
    }
    @Test
    public void Nullness()
    {
        TestApp test = new TestApp();
        Assert.assertNull("This object is not null",test.generateNull("lala"));
    }
    @After
    public void testAfter()
    {
        System.out.println("in after class (Truth)");
    }
}