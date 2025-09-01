package Homework_TestNG;

import SeleniumBascis2.Utlilites.ScreenShotService;
import SeleniumBascis3.Factory.DriverFactory_F3;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CuraHealthcareService {

    private WebDriver driver;
    private DriverFactory_F3 driverFactory;
    private TestNG.Homework_TestNG.Page.CuraHealthcareServicePage pageCura;
    private static Logger LOGER = LoggerFactory.getLogger(CuraHealthcareService.class);

    @BeforeTest
    public void initTest(){
        LOGER.info("Executarea metodei inainte de testare...!");
        driverFactory = new DriverFactory_F3();
        driver = driverFactory.getDriver1();
        pageCura = new TestNG.Homework_TestNG.Page.CuraHealthcareServicePage(driver);
        LOGER.info("Testul de initializare a fost finalizat.");
    }
    @Test//Valid
    public void loginUserValid(){
        pageCura.Page();
        pageCura.clickonClick();
        pageCura.goToLogin();
        pageCura.goToEmail();
        pageCura.goToParola();
        pageCura.goToConfirm();
        pageCura.OK();
    }
    @Test//Invalid
    public void loginUserInvalid(){
        pageCura.Page();
        pageCura.clickonClick();
        pageCura.goToLogin();
        pageCura.goToEmailInvalid();
        pageCura.goToParola();
        pageCura.goToConfirm();
        LOGER.info("Mesajul afisat este o eroare: " +  pageCura.getText());
    }
    @AfterTest
    public void finalizeTest(){
        LOGER.info("Test incheiat, inchidere driver!");
        ScreenShotService.takeScreenShot(driver);
        driver.quit();
    }
}
