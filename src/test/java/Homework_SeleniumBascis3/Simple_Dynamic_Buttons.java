package Homework_SeleniumBascis3;

import SeleniumBascis3.Factory.DriverFactory_F3;
import SeleniumBascis3.Homework_SeleniumBascis3.Page.Simple_Dynamic_Buttons_Page;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Dynamic_Buttons {

    private WebDriver driver;
    private DriverFactory_F3 factory;
    private Simple_Dynamic_Buttons_Page multiclicuri;
    private static Logger LOGER = LoggerFactory.getLogger(Simple_Dynamic_Buttons_Page.class);

    @BeforeTest
    public void initializareTest(){
        LOGER.info("Initialiare ametodei inainte de testare");
        factory = new DriverFactory_F3();
        driver = factory.getDriver1();
        multiclicuri = new Simple_Dynamic_Buttons_Page(driver);
        LOGER.info("Initializarea metodei dupa testre");
    }
    @Test
    public void MultiCllicuri(){
        multiclicuri.goToPage();
        multiclicuri.clickStart();
        multiclicuri.clickOne();
        multiclicuri.time();
        multiclicuri.clickTwo();
        multiclicuri.time1();
        multiclicuri.clickThree();
        multiclicuri.textMesaj();
        multiclicuri.time2();
        Assert.assertEquals(multiclicuri.textMesaj(), "All Buttons Clicked");
        System.out.println("=======================");
        System.out.println(multiclicuri.textMesaj());
        System.out.println("=======================");
    }
    @AfterTest
    public void finalizareTest(){
        LOGER.info("Terminarea testului, inchiderea driverului");
        driver.quit();
    }
}
//=> Simple_Dynamic_Buttons
