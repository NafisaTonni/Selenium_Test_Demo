package TestNG1;

import org.testng.annotations.Test;

@Test
public class TestCase {

    void setup()
    {
        System.out.println("I am inside setup");
    }
    void testSteps()
    {
       System.out.println("I am inside testSteps");
    }

    void tearDown()
    {
        System.out.println(("I am inside tearDown"));
    }

}
