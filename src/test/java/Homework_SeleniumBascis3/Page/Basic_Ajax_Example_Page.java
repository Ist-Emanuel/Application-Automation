package Homework_SeleniumBascis3.Page;

import SeleniumBascis3.pages.BasePage_D2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Basic_Ajax_Example_Page extends BasePage_D2 {
    public Basic_Ajax_Example_Page(WebDriver driver1) {
        super(driver1);
    }
    @FindBy(xpath = "//input[@class='styled-click-button']")
    private WebElement CodeInIt;

    private static final String COD_URL = "https://testpages.herokuapp.com/styled/basic-ajax-test.html";
    private static Logger LOGER = LoggerFactory.getLogger(Basic_Ajax_Example_Page.class);

    public void goPage(){
        LOGER.info("Directionarea pe pagina!");
        driver1.get(COD_URL);
    }
    public String Actual_URL(){
        return driver1.getCurrentUrl();
    }
    public void clickOnClick(){
        CodeInIt.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
//=> Basic_Ajax_Example_Page
