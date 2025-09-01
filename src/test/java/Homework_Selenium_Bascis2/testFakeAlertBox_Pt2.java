package Homework_Selenium_Bascis2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testFakeAlertBox_Pt2 {
    private static final String FAKE_ALERTS = "https://testpages.eviltester.com/styled/index.html";

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver box = new ChromeDriver();
        box.manage().window().maximize();
        //1. Go to /alerts page
        box.get(FAKE_ALERTS);
        //2. Click "Fake Alerts"
        WebElement element = box.findElement(By.id("fakealerttest"));
        element.click();
        Thread.sleep(800);
        //3. Click "Show fake alert box"
        WebElement element1 = box.findElement(By.id("fakealert"));
        element1.click();
        Thread.sleep(800);
//        WebElement element2 = box.findElement(By.id("dialog-ok"));
//        element2.click();                                                     //Prima varianta
        box.switchTo().parentFrame().findElement(By.id("dialog-ok")).click();   //A doua varianta
        //4. Click "Show modal dialog"
        Thread.sleep(800);
        WebElement element3 = box.findElement(By.id("modaldialog"));
        element3.click();
        box.switchTo().parentFrame().findElement(By.xpath("//button[@class='dialog-button']")).click();
    }
}
