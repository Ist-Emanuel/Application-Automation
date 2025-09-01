package Homework_SeleniumBascis3.Page;

import SeleniumBascis3.pages.BasePage_D2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.time.Duration;

public class Disabled_Dynamic_Buttons_Pages extends BasePage_D2 {
    public Disabled_Dynamic_Buttons_Pages(WebDriver driver1) {
        super(driver1);
    }

    private static final String URL_DISABLE = "https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html";
    private static Logger LOGER = LoggerFactory.getLogger(Disabled_Dynamic_Buttons_Pages.class);

    @FindBy(id = "button00")
    private WebElement start;
    @FindBy(id = "button01")
    private WebElement one;
    @FindBy(id = "button02")
    private WebElement two;
    @FindBy(id = "button03")
    private WebElement three;
    @FindBy(id = "buttonmessage")
    private WebElement mesajul;

    public void Page(){
        LOGER.info("Deschiderea pagini");
        driver1.get(URL_DISABLE);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickStart(){
        start.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickOne(){
        one.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void clickTwo(){
        two.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickThree(){
        three.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void verificareMesaj() throws InterruptedException {
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(mesajul.getText(), "Click Buttons In Order");
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mesajul.getText();
        System.out.println("============================================");
        System.out.println(mesajul.getText());
        System.out.println("============================================");
    }
}
//=> Disabled_Dynamic_Buttons_Pages
//=> Video