package za.ac.cput.Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
public class testEquality {
    @Before
    public void testBefore()
    {
        System.out.println("in before class (Equality)");
    }
    @Test
    public void Equality()
    {
        TestApp test = new TestApp();
        Assert.assertSame("ac",test.generateString("ab"));
    }
    @After
    public void testAfter()
    {
        System.out.println("in after class (Equality)");
    }
}