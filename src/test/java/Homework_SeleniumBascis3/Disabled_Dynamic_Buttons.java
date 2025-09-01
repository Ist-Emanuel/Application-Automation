package Homework_SeleniumBascis3;

import SeleniumBascis3.Factory.DriverFactory_F3;
import SeleniumBascis3.Homework_SeleniumBascis3.Page.Disabled_Dynamic_Buttons_Pages;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Disabled_Dynamic_Buttons {

    private WebDriver driver;
    private DriverFactory_F3 factory;
    private Disabled_Dynamic_Buttons_Pages disable;
    private static Logger LOGER = LoggerFactory.getLogger(Disabled_Dynamic_Buttons.class);

    @BeforeTest
    public void goToPageMobile(){
        LOGER.info("Initializarea metodei inainte de testare");
        factory = new DriverFactory_F3();
        driver = factory.getDriver1();
        disable = new Disabled_Dynamic_Buttons_Pages(driver);
        LOGER.info("Initializarea metodei dupa testare");
    }
//TODO - de verificat
    @Test
    public void goPage() throws InterruptedException {
        disable.Page();
        disable.clickStart();
        disable.clickOne();
        disable.clickTwo();
        disable.clickThree();
        disable.verificareMesaj();
    }
    @AfterTest
    public void finalizare(){
        driver.quit();
    }
}
//=> Disabled_Dynamic_Buttons
//=> Exemplu pentru suita de mobile
