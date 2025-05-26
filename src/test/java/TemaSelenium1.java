
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TemaSelenium1 {

    private static final String URL = "https://demoqa.com/";

    public static void main(String[] args) throws InterruptedException {

        // 1. Go to https://demoqa.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        //       2. A. Click "Forms" card
        WebElement forms = driver.findElement(By.xpath("//div[@class = 'card mt-4 top-card'][2]"));
        forms.click();

        //B.Click "Practice Form"
        WebElement PracticeForm = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        PracticeForm.click();

        //C. Click "farstName"
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Emanuel");

        //D. Click "lastname"
        WebElement lastName =  driver.findElement(By.id("lastName"));
        lastName.sendKeys("Istrate");

        //E. Click "useremail"
        driver.findElement(By.id("userEmail")).sendKeys("marin.mm758@gmail.com");
        //La puntu "D" nu am mai stocat intr-o variabila;

        //F. click "Male"
        WebElement butonFemale = driver.findElement(By.xpath("//label[text()='Male']"));
        butonFemale.click();

        //G. click "userNumber"
        WebElement userNumber = driver.findElement(By.id("userNumber"));
        userNumber.sendKeys("0725616424");

        //H. click "dateOfBirthInput"
        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthInput.click();
             //-Luna
        WebElement elementLuna = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
             //.react-datepicker__month-select
        Select monthSelect = new Select(elementLuna);
        monthSelect.selectByContainsVisibleText("August");
             //Ziua
        WebElement dayElement = driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, August 7th, 2025']"));
        dayElement.click();

        //I. Click "Subjects"
        WebElement element = driver.findElement(By.id("subjectsInput"));
        element.sendKeys("M");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Maths')]")).click();
        WebElement element1 = driver.findElement(By.id("subjectsInput"));
        element1.sendKeys("C");
        Thread.sleep(900);
        driver.findElement(By.xpath("//div[text()='Physics']")).click();
        WebElement element4 = driver.findElement(By.id("subjectsInput"));
        element4.sendKeys("A");
        Thread.sleep(800);
        driver.findElement(By.xpath("//div[text()='Accounting']")).click();
        WebElement element5 = driver.findElement(By.id("subjectsInput"));
        element5.sendKeys("H");
        Thread.sleep(800);
        driver.findElement(By.xpath("//div[text()='Hindi']")).click();
        WebElement element6 = driver.findElement(By.id("subjectsInput"));
        element6.sendKeys("B");
        Thread.sleep(700);
        driver.findElement(By.xpath("//div[text()='Biology']")).click();
        WebElement element7 = driver.findElement(By.id("subjectsInput"));
        element7.sendKeys("S");
        Thread.sleep(600);
        driver.findElement(By.xpath("//div[text()='Social Studies']")).click();
        WebElement element8 = driver.findElement(By.id("subjectsInput"));
        element8.sendKeys("E");
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='English']")).click();
        WebElement element9 = driver.findElement(By.id("subjectsInput"));
        element9.sendKeys("C");
        Thread.sleep(400);
        driver.findElement(By.xpath("//div[text()='Commerce']")).click();
        WebElement element10 = driver.findElement(By.id("subjectsInput"));
        element10.sendKeys("C");
        Thread.sleep(300);
        driver.findElement(By.xpath("//div[text()='Civics']")).click();

        //J. Click "Hobies"
        WebElement element12 = driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline'][3]"));
        element12.click();

        //L. Click "Select picture"
        WebElement pictureElement2 = driver.findElement(By.xpath("//label[@class='form-file-label']"));
        pictureElement2.click();

        //M. Click "Curent address"
        WebElement addressElement = driver.findElement(By.id("currentAddress"));
        addressElement.sendKeys("Com.Dragomiresti, str.Ciocanesti, nr.751");

        //N. Click "State and City"
        WebElement state = driver.findElement(By.id("state"));
        state.click();
        driver.findElement(By.xpath("//div[text()='NCR']")).click();
        WebElement city = driver.findElement(By.id("city"));
        city.click();
        driver.findElement(By.xpath("//div[text()='Gurgaon']")).click();

        //O. Click "Submit"
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        //3. Verify URL is https://demoqa.com/forms
        String curentURL = driver.getCurrentUrl();
        //"getCurrentURL()" ne returneaza un strin si asa ca putem sa-l salvam intr-o variabila de String;
        System.out.println(curentURL);
        //4. Close browser (using driver)
//        driver.close();
    }
}
