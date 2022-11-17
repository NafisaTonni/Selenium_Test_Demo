package TestNG1;

import org.testng.annotations.Test;

public class TestCase1 {
    @Test(priority = 1)
    void setup()
    {
        System.out.println("I am inside setup");
    }
    @Test(priority = 2)
    void testSteps()
    {
        System.out.println("I am inside testSteps");
    }
    @Test(priority = 3)
    void tearDown()
    {
        System.out.println(("I am inside tearDown"));
    }

}
