package Homework_Selenium_Bascis2;

import SeleniumBascis2.Utlilites.ScreenShotService;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class browserWindowsTest {

    private static final String BROWSER_HTTPS = "https://demoqa.com/browser-windows";

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        //1. Go to /alerts page
        browser.get(BROWSER_HTTPS);
        try {
            //2. Click /New Tab;
            Thread.sleep(1000);
            WebElement buttonNewTab = browser.findElement(By.id("tabButton"));
            buttonNewTab.click();
            Thread.sleep(1000);
            Set<String> windowHandle1 = browser.getWindowHandles();
            Iterator<String> interator = windowHandle1.iterator();
            String parinte = interator.next();
            String copil = interator.next();
            browser.switchTo().window(copil);
            ScreenShotService.takeScreenShot(browser);
            WebElement element = browser.findElement(By.id("sampleHeading"));
            element.getText();
            System.out.println(element.getText());
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            browser.close();
        }
    }
}

