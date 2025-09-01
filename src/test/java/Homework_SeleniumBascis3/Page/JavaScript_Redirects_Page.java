package Homework_SeleniumBascis3.Page;

import SeleniumBascis2.Utlilites.ScreenShotService;
import SeleniumBascis3.pages.BasePage_D2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class JavaScript_Redirects_Page extends BasePage_D2 {
    public JavaScript_Redirects_Page(WebDriver driver1) {
        super(driver1);
    }
    @FindBy(id = "delaygotobasic")
    private WebElement clickTransported;
    @FindBy(id = "goback")
    private WebElement Back;
    @FindBy(id = "delaygotobounce")
    private WebElement douaSecunde;

    private static final String JAVA_URL = "https://testpages.herokuapp.com/styled/javascript-redirect-test.html";
    private static Logger LOGER = LoggerFactory.getLogger(JavaScript_Redirects_Page.class);

    public void goToPageJava(){
        driver1.get(JAVA_URL);
    }
    public void goToClickTransported(){
        clickTransported.click();
    }
    public void timp(){
        WebDriverWait pauza = new WebDriverWait(driver1, Duration.ofSeconds(5));
        try{
        pauza.until(ExpectedConditions.titleIs("https://testpages.herokuapp.com/styled/javascript-redirect-test.html)"));
        }catch(Exception e){
            LOGER.warn(e.getMessage());
            e.printStackTrace();
            ScreenShotService.takeScreenShot(driver1);
        }
    }
    public void goToBack(){
        Back.click();
    }
    public void goToDouaSecunde(){
        douaSecunde.click();
    }
    public void time1(){
        WebDriverWait time1 = new WebDriverWait(driver1, Duration.ofSeconds(2));
        try{
            time1.until(ExpectedConditions.titleIs("https://testpages.herokuapp.com/styled/javascript-redirect-test.html"));
        }catch(Exception e){
            LOGER.warn(e.getMessage());
            e.printStackTrace();
            ScreenShotService.takeScreenShot(driver1);
        }
    }
}
//=> Video
