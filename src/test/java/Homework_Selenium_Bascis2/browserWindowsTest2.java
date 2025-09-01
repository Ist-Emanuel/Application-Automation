package Homework_Selenium_Bascis2;

import SeleniumBascis2.Utlilites.ScreenShotService;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class browserWindowsTest2 {
    private static final String BROWSER_HTTPS = "https://demoqa.com/browser-windows";

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();
        try {
            browser.manage().window().maximize();
            browser.get(BROWSER_HTTPS);
            Thread.sleep(1000);
            browser.findElement(By.id("windowButton")).click();
            Thread.sleep(1000);
            Set<String> lista = browser.getWindowHandles();
            Iterator<String> iteratorLista = lista.iterator();
            String principal = iteratorLista.next();
            String secundar = iteratorLista.next();
            browser.switchTo().window(secundar);
            Thread.sleep(1000);
            WebElement element1 = browser.findElement(By.id("sampleHeading"));
            element1.getText();
            System.out.println(element1.getText());
            ScreenShotService.takeScreenShot(browser);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            browser.close();
        }
    }
}

