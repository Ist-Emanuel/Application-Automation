package Homework_SeleniumBascis3;

import SeleniumBascis3.Factory.DriverFactory_F3;
import SeleniumBascis3.Homework_SeleniumBascis3.Page.JavaScript_Redirects_Page;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScript_Redirects {


    private WebDriver driver;
    private DriverFactory_F3 factorii;
    private JavaScript_Redirects_Page javaPage;
    private static Logger LOGER = LoggerFactory.getLogger(JavaScript_Redirects.class);

    @BeforeTest
    public void initializare(){
        LOGER.info("Initializarea metodei inainte de testare");
        factorii = new DriverFactory_F3();
        driver = factorii.getDriver1();
        javaPage = new JavaScript_Redirects_Page(driver);
        LOGER.info("Initializarea metodei dupa testare");
    }
//  5 secunde
    @Test
    public void goToBageJavaScript(){
        javaPage.goToPageJava();
        javaPage.goToClickTransported();
        javaPage.timp();
        javaPage.goToBack();
    }
//  2 secunde
    @Test
    public void goToPageJava(){
        javaPage.goToPageJava();
        javaPage.goToDouaSecunde();
        javaPage.time1();
        javaPage.goToBack();
    }
    @AfterTest
    public void finalizareTest(){
        LOGER.info("Sfarsitul testului, inchiderea draivarului");
        driver.quit();
    }
}
//=> JavaScript_Redirects
