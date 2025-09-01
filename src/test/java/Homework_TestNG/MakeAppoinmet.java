package Homework_TestNG;

import SeleniumBascis3.Factory.DriverFactory_F3;
import TestNG.Homework_TestNG.Page.MakeAppointmentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MakeAppoinmet {


    private WebDriver driver;
    private DriverFactory_F3 driverFactory;
    private MakeAppointmentPage Make;
    ChromeOptions chromeOptions;

    private static Logger LOGER = LoggerFactory.getLogger(MakeAppoinmet.class);

    @BeforeTest
    public void initTest1(){
        LOGER.info("Executarea metodei inainte de testare...!");
        chromeOptions = new ChromeOptions();
        driverFactory = new DriverFactory_F3();
        driver = driverFactory.getDriver1();

        Make = new MakeAppointmentPage(driver);
        LOGER.info("Testul de iitializare a fost finalizat.");
    }

    @Test
    public void clickMakeAppoiment(){
        chromeOptions.addArguments("--icognito");
        Make.PageMake();
        Make.goToClickMakeAppoiment();
        Make.goUserName();
        Make.goToParola();
        Make.goCofirm();
        //TODO - de verificat
    }





    @AfterTest
    public void terminareaTestului(){
//        driver.quit();
    }


}
