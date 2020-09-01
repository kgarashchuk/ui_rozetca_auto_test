package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.InitWebDriver;
import utils.PropertiesReader;

import java.util.List;

public abstract class BaseStep {

    private final int TIMEOUT = 15;
    private final int POLLING = 100;

    private PropertiesReader pr = new PropertiesReader();

    public void waitVisibility(By elementBy) {
        WebDriverWait wait = new WebDriverWait(InitWebDriver.driver, TIMEOUT, POLLING);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    public void click(By elementBy) {
        waitVisibility(elementBy);
        InitWebDriver.driver.findElement(elementBy).click();
    }

    public List<WebElement> getElementListByText(String text) {
        return InitWebDriver.driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

}