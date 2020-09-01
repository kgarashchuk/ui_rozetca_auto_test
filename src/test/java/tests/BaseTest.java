package tests;

import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.InitWebDriver;

public class BaseTest {

    private InitWebDriver init = new InitWebDriver();

    @BeforeMethod
    public void setUp(){
        init.init();
    }

    @AfterMethod
    public void tearDown(){
        if (InitWebDriver.driver != null) {
            InitWebDriver.driver.manage().deleteAllCookies();
            InitWebDriver.driver.quit();
        }
    }

}
