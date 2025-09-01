package Homework_SeleniumBascis3.Page;

import SeleniumBascis3.pages.BasePage_D2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class Simple_Dynamic_Buttons_Page extends BasePage_D2 {
    public Simple_Dynamic_Buttons_Page(WebDriver driver1) {
        super(driver1);
    }
    private static final String URL_SIMPLE_PAGE = "https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html";
    private static Logger LOGER = LoggerFactory.getLogger(Simple_Dynamic_Buttons_Page.class);

    public void goToPage(){
        LOGER.info("Deschiderea pagini");
        driver1.get(URL_SIMPLE_PAGE);
    }

    @FindBy(id = "button00")
    private WebElement start;
    @FindBy(id = "button01")
    private WebElement ONE;
    @FindBy(id = "button02")
    private WebElement Two;
    @FindBy(id = "button03")
    private WebElement Three;
    @FindBy(id = "buttonmessage")
    private WebElement mesaj;

    public void clickStart(){
        start.click();
    }
    public void clickOne(){
        ONE.click();
    }
    public void clickTwo(){
        Two.click();
    }
    public void time(){
        WebDriverWait secunde = new WebDriverWait(driver1, Duration.ofSeconds(6));
        secunde.until(ExpectedConditions.elementToBeClickable(Two));
    }
    public void clickThree(){
        Three.click();
    }
    public void time1(){
        WebDriverWait secunde = new WebDriverWait(driver1, Duration.ofSeconds(6));
        secunde.until(ExpectedConditions.elementToBeClickable(Three));
    }
    public String textMesaj(){
        return mesaj.getText();
    }
    public void time2(){
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(mesaj));
    }
}
//=> Simple_Dynamic_Buttons_Page
//=> Video