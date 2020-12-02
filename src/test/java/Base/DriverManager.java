package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private static WebDriver driver;

      public static WebDriver getWebDriver() {
//          uruchomienie przeglądarki bez gui
          ChromeOptions options = new ChromeOptions();
          options.addArguments("--headless");
        if (driver == null) {
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void closedDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }
}
