package OpenGoogle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestOpenGoogle {
    @Test
    public void testGoogle()
    {
        WebDriverManager.chromedriver().setup();
        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://www.google.com/");

    }
}
