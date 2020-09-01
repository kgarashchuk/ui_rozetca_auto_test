package asserts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import steps.MainStep;

import java.util.List;

public class MainAssert {

    private MainStep step = new MainStep();

    public void assertElementPresentsByText(String text){
        List<WebElement> elementListByText = step.getElementListByText(text);
        Assert.assertTrue(elementListByText.size() != 0);
    }

}
