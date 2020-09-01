package steps;

import utils.InitWebDriver;
import utils.PropertiesReader;

public class MainStep extends BaseStep{

    private PropertiesReader pr = new PropertiesReader();

    public void goToMainPage(){
        InitWebDriver.driver.get(pr.getUrl());
    }


}
