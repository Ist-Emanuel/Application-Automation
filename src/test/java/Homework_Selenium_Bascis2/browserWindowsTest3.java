package Homework_Selenium_Bascis2;

import SeleniumBascis2.Utlilites.ScreenShotService;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class browserWindowsTest3 {
    private static final String BROWSER = "https://demoqa.com/browser-windows";
    //TODO - De verificat;

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();

        try {
            browser.manage().window().maximize();
            browser.get(BROWSER);
            Thread.sleep(800);
            WebElement element = browser.findElement(By.id("messageWindowButton"));
            element.click();
            Set<String> Handles = browser.getWindowHandles();
            Iterator<String> iterator = Handles.iterator();
            String tatal = iterator.next();
            String fiu = iterator.next();
            WebDriver webDriver = browser.switchTo().newWindow(WindowType.valueOf("about:blank"));
            webDriver.switchTo().window(fiu);
            Thread.sleep(800);
            browser.switchTo().alert().getText().isBlank();
            WebElement element2 = browser.findElement(By.tagName("//body[contains(@data-new-gr-c-s-check-loaded,'14.1238.0')]"));
            String text = element2.getText();
            System.out.println(text);
            ScreenShotService.takeScreenShot(browser);
        } catch(IllegalArgumentException e) {
            String message = e.getMessage();
            System.out.println(message);
            ScreenShotService.takeScreenShot(browser);
        } finally {
            browser.close();
        }
    }
}
