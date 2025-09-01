package Homework_SeleniumBascis3.Page;

import SeleniumBascis3.pages.BasePage_D2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Refresh_Page_Test_PAGE extends BasePage_D2 {
    public Refresh_Page_Test_PAGE(WebDriver driver1) {
        super(driver1);
    }

    @FindBy(id = "button")
    private WebElement button;
    @FindBy(id = "refreshdisplay")
    private WebElement text;

    private static final String URL_REFRESH = "https://testpages.herokuapp.com/styled/refresh";
    private static Logger LOGER = LoggerFactory.getLogger(Refresh_Page_Test_PAGE.class);

    public void goPage(){
        LOGER.info("Deschiderea pagini");
        driver1.get(URL_REFRESH);
    }
    public void clickButton() throws InterruptedException {
        Thread.sleep(1000);
        button.click();
    }
    public String Refresh2122(){
        return driver1.getCurrentUrl();
    }
    public String mesaj(){
        return text.getText();
    }
}
//=> Refresh_Page_Test_PAGE
