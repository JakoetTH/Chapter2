package za.ac.cput.Chapter2;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
public class testInteger {
    @Before
    public void testBefore()
    {
        System.out.println("in before class (Integer)");
    }
    @Test
    public void Integer()
    {
        TestApp test = new TestApp();
        Assert.assertEquals(16,test.generateInteger(3, 4),1);
    }
    @After
    public void testAfter()
    {
        System.out.println("in after class (Integer)");
    }
}