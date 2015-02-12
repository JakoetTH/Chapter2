package za.ac.cput.Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
public class testIgnore {
    @Before
    public void testBefore()
    {
        System.out.println("in before class (Truth)");
    }
    @Ignore
    @Test
    public void Ignore()
    {
        TestApp test = new TestApp();
        Assert.assertSame("ac", test.generateString("ab"));
    }
    @After
    public void testAfter()
    {
        System.out.println("in after class (Truth)");
    }
}