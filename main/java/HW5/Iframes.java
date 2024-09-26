package HW5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

        driver.switchTo().frame(1);
        WebElement inFrame=driver.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));

        driver.switchTo().frame(inFrame);

        WebElement ageCB=driver.findElement(By.xpath("//input[@value='Option-1']"));
        ageCB.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

       WebElement cityDD=driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel=new Select(cityDD);
        sel.selectByVisibleText("Chicago");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);

        WebElement userName=driver.findElement(By.xpath("//input[@name='Username']"));
        userName.sendKeys("JuliaG");

    }
}
