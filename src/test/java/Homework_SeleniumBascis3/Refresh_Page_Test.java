package Homework_SeleniumBascis3;

import SeleniumBascis2.Utlilites.ScreenShotService;
import SeleniumBascis3.Factory.DriverFactory_F3;
import SeleniumBascis3.Homework_SeleniumBascis3.Page.Refresh_Page_Test_PAGE;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Refresh_Page_Test {

    private WebDriver driver;
    private DriverFactory_F3 factory;
    private Refresh_Page_Test_PAGE Refresh;
    private static Logger LOGER = LoggerFactory.getLogger(Refresh_Page_Test.class);

    @BeforeTest
    public void initializareaTestului(){
        LOGER.info("Initializarea methodei ianintea testului");
        factory = new DriverFactory_F3();
        driver = factory.getDriver1();
        Refresh = new Refresh_Page_Test_PAGE(driver);
        LOGER.info("Initializarea metodei dupa testare");
    }
    @Test
    public void clickRefersh() throws InterruptedException {
        Refresh.goPage();
        Refresh.clickButton();
        String actual = Refresh.Refresh2122();
        String result = Refresh.mesaj();
        Assert.assertNotEquals(actual, result,
                "La fiecare click, detaliile de pe pagina respectiva se va schimba!");
    }
    @AfterTest
    public void terminareaTestului(){
        LOGER.info("Finalizarea testului, inchiderea driverului");
        ScreenShotService.takeScreenShot(driver);
        driver.quit();
    }
}
//=> Refresh_Page_Test
//=> Video
