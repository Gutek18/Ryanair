package StepDefinition;

import Base.BaseUtil;
import Base.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {

    @Before
    public void InitializeTest() {
        DriverManager.getWebDriver();
        BaseUtil.setInitialConfiguration();
    }

    @After
    public void TearDownTest(Scenario scenario) {
        DriverManager.closedDriver();
        if (scenario.isFailed()) {
            //to do screenshoot!!
            System.out.println(scenario.getName());
        }
    }
}
