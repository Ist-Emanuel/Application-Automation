package Homework_Selenium_Bascis2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAlertBox_Pt1 {
    private static final String ALERTS_JAVASCRIPT = "https://testpages.eviltester.com/styled/index.html";

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver alerteBox = new ChromeDriver();
        alerteBox.manage().window().maximize();
        //1. Go to /alerts page
        alerteBox.get(ALERTS_JAVASCRIPT);
        //2. Click of button "alerttest";
        alerteBox.findElement(By.id("alerttest")).click();
        //3. The following button will display an alert when clicked.
        WebElement element = alerteBox.findElement(By.id("alertexamples"));
        element.click();
        try {
            Thread.sleep(1000);
            alerteBox.switchTo().alert().accept();
        } catch (InterruptedException exception) {
            String message = exception.getMessage();
            System.out.println(message);
        } finally {
//            alerteBox.close();
        }
        Thread.sleep(1000);
        //4. The following button will display a confirm dialog when clicked.
        WebElement confirmBox = alerteBox.findElement(By.id("confirmexample"));
        confirmBox.click();
        alerteBox.switchTo().alert().accept();
        Thread.sleep(1000);
        //5. The following button will display a prompt dialog when clicked.
        WebElement promptBox = alerteBox.findElement(By.id("promptexample"));
        promptBox.click();
        Thread.sleep(800);
        alerteBox.switchTo().alert().sendKeys("Resolving the pop-up :)))))");
        Thread.sleep(800);
        alerteBox.switchTo().alert().accept();
        Thread.sleep(800);
        //alerteBox.close();
    }
}
