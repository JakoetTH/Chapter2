package za.ac.cput.Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
public class testTimeout {
    @Before
    public void testBefore()
    {
        System.out.println("in before class (Truth)");
    }
    @Test(timeout = 10)
    public void Timeout()
    {
        TestApp test = new TestApp();
        test.infiniteLoop();
    }
    @After
    public void testAfter()
    {
        System.out.println("in after class (Truth)");
    }
}