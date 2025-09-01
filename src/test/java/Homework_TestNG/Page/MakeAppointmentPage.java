package Homework_TestNG.Page;

import SeleniumBascis3.pages.BasePage_D2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MakeAppointmentPage extends BasePage_D2 {
    public MakeAppointmentPage(WebDriver driver1) {
        super(driver1);
    }

    private static final String COD = "https://katalon-demo-cura.herokuapp.com/profile.php#login";
    private static Logger LOGER = LoggerFactory.getLogger(MakeAppointmentPage.class);

    @FindBy(id = "btn-make-appointment")
    private WebElement clickMake;
    @FindBy(id = "txt-username")
    private WebElement userName;
    @FindBy(id = "txt-password")
    private WebElement parola;
    @FindBy(id = "btn-login")
    private WebElement confirm;

    public void PageMake(){
        LOGER.info("Pornirea pagini!");
        driver1.get(COD);
    }
    public void goToClickMakeAppoiment(){
        clickMake.click();
    }
    public void goUserName(){
        userName.sendKeys("John Doe");
    }
    public void goToParola(){
        parola.sendKeys("ThisIsNotAPassword");
    }
    public void goCofirm(){
        confirm.click();
    }
}
