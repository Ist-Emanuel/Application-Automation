package Homework_TestNG.Page;

import SeleniumBascis3.pages.BasePage_D2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuraHealthcareServicePage extends BasePage_D2 {

    public CuraHealthcareServicePage(WebDriver driver1) {
        super(driver1);
    }
    @FindBy(xpath = "//a[@class='btn btn-dark btn-lg toggle']")
    private WebElement click;
    @FindBy(xpath = "//a[text()='Login']")
    private WebElement goLogin;
    @FindBy(id = "txt-username")
    private WebElement Email;
    @FindBy(id = "txt-password")
    private WebElement Parola;
    @FindBy(id = "btn-login")
    private WebElement Confirm;

    //Logare cu invalid incorect;
    @FindBy(id = "txt-username")
    private WebElement emailInvalid;
    @FindBy(xpath = "//p[@class='lead text-danger']")
    private WebElement TextErroare;

    private static final String URL_CURA = "https://katalon-demo-cura.herokuapp.com/";
    private static final String COD = "https://katalon-demo-cura.herokuapp.com/#appointment";
    private static Logger LOGER = LoggerFactory.getLogger(CuraHealthcareServicePage.class);

    public void Page(){
        driver1.get(URL_CURA);
    }
    public void clickonClick(){
        click.click();
    }
    public void goToLogin(){
        goLogin.click();
    }
    public void goToEmail(){
        emailInvalid.sendKeys("John Doe");
    }
    public void goToParola(){
        Parola.sendKeys("ThisIsNotAPassword");
    }
    public void goToConfirm(){
        Confirm.click();
    }
    public void OK(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver1.switchTo().activeElement().click();
    }

    //Logare cu invalid incorect;
    public void goToEmailInvalid(){
        emailInvalid.sendKeys("Istrate Emanuel");
    }
    public String getText(){
       return TextErroare.getText();
    }
}
//=> Scenariu pozitiv
//=> Scenariu negativ
