import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExercises_Selenium1 {

    private static final String COD_UNIC = "https://testpages.herokuapp.com/styled/index.html";

    public static void main(String[] args) throws InterruptedException {

        //1. Parcurgeti primele patru link-uri de la bagina:  "https://testpages.herokuapp.com/styled/index.html"
        WebDriverManager.chromedriver().setup();
        WebDriver motor = new ChromeDriver();
        motor.manage().window().maximize();
        motor.get(COD_UNIC);
        WebElement basicpagetest = motor.findElement(By.id("basicpagetest"));
        basicpagetest.click();
        Thread.sleep(500);
        motor.findElement(By.xpath("//div[@class='page-navigation']")).click();
        Thread.sleep(500);
        WebElement elementattributestest = motor.findElement(By.id("elementattributestest"));
        elementattributestest.click();
        Thread.sleep(500);
        motor.findElement(By.xpath("//div[@class='page-navigation']")).click();
        Thread.sleep(500);
        WebElement findbytest = motor.findElement(By.id("findbytest"));
        findbytest.click();
        Thread.sleep(500);
        motor.findElement(By.xpath("//div[@class='page-navigation']")).click();
        Thread.sleep(500);
        WebElement webdriverexamplepage = motor.findElement(By.id("webdriverexamplepage"));
        webdriverexamplepage.click();
        Thread.sleep(700);
        WebElement numentry = motor.findElement(By.id("numentry"));
        numentry.sendKeys("5782");
        Thread.sleep(700);
        WebElement element = motor.findElement(By.id("submit-to-server"));
        element.click();
        Thread.sleep(700);
        motor.findElement(By.xpath("//div[@class='page-navigation']")).click();
        Thread.sleep(500);
    }
}
