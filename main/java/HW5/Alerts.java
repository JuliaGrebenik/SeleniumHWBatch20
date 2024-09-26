package HW5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

WebElement birthdayReminder=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
birthdayReminder.click();

        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        WebElement deleteFile=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        deleteFile.click();
        alert.dismiss();
        System.out.println(deleteFile.getText());


        WebElement enterYourName=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        enterYourName.click();
        alert.sendKeys("Julia Grebenik");
        alert.accept();

        WebElement ver=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        String nameTxt=ver.getText();
        System.out.println("Name is "+nameTxt);
        if(nameTxt.equals("You have entered 'Julia Grebenik' !")){
            System.out.println("Correct name is displayed");
        }
    }
}
