package tests;

import asserts.MainAssert;
import org.testng.annotations.Test;
import steps.MainStep;

public class MainTest extends BaseTest{
    private MainStep step = new MainStep();
    private MainAssert asserts = new MainAssert();

    /**
     *  Тест проверяет наличие текста 'Доставка по всей Украине' на главной странице сайта
     */
    @Test
    public void test_001(){
        //1.открыть главную страницу сайта
        step.goToMainPage();

        //2.проверить что на странице содержится текст 'Доставка по всей Украине'
        asserts.assertElementPresentsByText("Доставка по всей Украине");
    }

}
