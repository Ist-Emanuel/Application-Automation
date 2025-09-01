package Homework_Selenium_Bascis2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HTML_Form_Example {
    private static final String HTTPS_FORM_TEST = "https://testpages.eviltester.com/styled/basic-html-form-test.html";

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //1. Go to /alerts page
        driver.get(HTTPS_FORM_TEST);
        Thread.sleep(1000);
        //2. Writing the name;
        WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
        name.sendKeys("Istrate Emanuel");
        Thread.sleep(1000);
        //3. Writing the password;
        WebElement parola = driver.findElement(By.xpath("//input[@name='password']"));
        parola.sendKeys("123456789");
        Thread.sleep(1000);
        //4. Writing comments;
        WebElement comentariul = driver.findElement(By.xpath("//textarea[@name='comments']"));
        comentariul.sendKeys("Vreau sa fie postate aceste date ale mele si sa fie procesate!:)))");
        Thread.sleep(1000);
        //5. Choosing the file;
        //TODO - De verificat sa fac cu sendKeys
        WebElement element4 = driver.findElement(By.xpath("//input[@name='filename']"));
        element4.sendKeys("C:\\Users\\Manuel\\IdeaProjects\\Application-Automation\\src\\test\\java\\SeleniumBascis2\\Test.txt");
        element4.sendKeys("C:\\Users\\Manuel\\Pictures\\2025 img\\WhatsApp Image 2025-05-23 at 17.32.16_2fa9d7ae.jpg");
        //6. Click the checkbox;
        WebElement element = driver.findElement(By.xpath("//input[@name='checkboxes[]']"));
        element.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@value,'cb3')]")).click();
        Thread.sleep(1000);
        //7. Click Radio Items
        WebElement element1 = driver.findElement(By.xpath("//input[@name='radioval'][3]"));
        element1.click();
        Thread.sleep(1000);
        //8. Click Multiple Select values;
        WebElement element2 = driver.findElement(By.cssSelector("select[name='multipleselect[]']"));
        Select select = new Select(element2);
        select.deselectByValue("ms4");
        select.selectByValue("ms1");
        //9. Click Dropdown;
        driver.findElement(By.xpath("//select[@name='dropdown']")).click();
        WebElement element3 = driver.findElement(By.cssSelector("select[name='dropdown']"));
        Select select1 = new Select(element3);
        select1.selectByValue("dd6");
        //10. Click SUBMIT;
        WebElement submitBatton = driver.findElement(By.name("save"));
        submitBatton.click();
    }
}
