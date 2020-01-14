package StepDefinition;

import Base.BaseUtil;
import Base.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hook extends BaseUtil {

    @Before
    public void InitializeTest() {
        DriverManager.getWebDriver();
        BaseUtil.setInitialConfiguration();
    }

    @After
    public void TearDownTest(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) DriverManager.getWebDriver();
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./target/Screenshots/" + scenario.getName() + ".png"));
        }
        DriverManager.closedDriver();
    }
}
