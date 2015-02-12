package za.ac.cput.Chapter2;


public class TestApp {
    public float generateFloatingPoint(float f1, float f2)
    {
        return f1 * f2;
    }
    public int generateInteger(int i1, int i2)
    {
        return i1 * i2;
    }
    public String generateString(String c1)
    {
        return c1;
    }
    public boolean generateBoolean(boolean b1)
    {
        return b1;
    }
    public String generateNull(String s1)
    {
        if(s1=="")
            return null;
        else
            return s1;
    }
    public void infiniteLoop()
    {
        for(int i = 0; i <= 1;)
        {

        }
    }
    public String[] generateArray() {
        String [] a1 = new String [6];
        return a1;
    }
}
