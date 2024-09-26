package HW4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithoutSelectTag {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        WebElement DD = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        DD.click();

        List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
        for (WebElement each : all) {
            if (each.getText().equals("Mango")) ;
            each.click();
        }

        WebElement favHobbiesDD = driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        favHobbiesDD.click();
        List<WebElement> allHobbies = driver.findElements(By.xpath("//ul[class='dropdown-menu multi-dropdown-menu']/li/a"));
        for(WebElement each:allHobbies){
            if(each.getText().equals("Reading"));
            each.click();
        }



            }
        }



