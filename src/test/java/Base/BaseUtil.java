package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseUtil {

    public static final String APPLICATION_URL = "https://www.ryanair.com/ie/en";

    public static void setInitialConfiguration(){
        DriverManager.getWebDriver().manage().window().maximize();
    }
    public static void navigateToPage(String pageUrl) {
        DriverManager.getWebDriver().navigate().to(pageUrl);
    }

}
