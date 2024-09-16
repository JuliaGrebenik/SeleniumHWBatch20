package HW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToLocators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        WebElement fullName=driver.findElement(By.id("fullName"));
        fullName.sendKeys("John Doe");

        WebElement email=driver.findElement(By.id("yourEmail"));
        email.sendKeys("john@doe.com");


        WebElement clientName=driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("John Mike Doe");

        WebElement clientID=driver.findElement(By.id("ClientId"));
        clientID.sendKeys("123456");

        WebElement clientFeedback=driver.findElement(By.id("ClientfeedbackId"));
        clientFeedback.sendKeys("Great work");

        WebElement projectName= driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("Locators");

        WebElement projectDeadlineTime=driver.findElement(By.id("ProjectTimeId"));
        projectDeadlineTime.sendKeys("September 22 2024");

        WebElement currentAddress=driver.findElement(By.name("CurrentAddress"));
        currentAddress.sendKeys("1234 Constitution ave, Arlington, VA");

        WebElement permanentAddress=driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys("Same as current");

        WebElement submitBtn=driver.findElement(By.id("btn-submit"));
        submitBtn.click();

        WebElement link= driver.findElement(By.linkText("Click Here."));
        link.click();

        WebElement submitBtn2=driver.findElement(By.id("btn-submit"));
        submitBtn.click();






    }
}
