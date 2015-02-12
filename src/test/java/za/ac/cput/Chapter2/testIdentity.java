package za.ac.cput.Chapter2;


import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
public class testIdentity {
    @Before
    public void testBefore()
    {
        System.out.println("in before class (Identity)");
    }
    @Test
    public void Identity()
    {
        TestApp test = new TestApp();
        Assert.assertNotSame("ab",test.generateString("ab"));
    }
    @After
    public void testAfter()
    {
        System.out.println("in after class (Identity)");
    }
}
