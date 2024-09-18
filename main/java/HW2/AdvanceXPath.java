package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXPath {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        WebElement book1=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        book1.sendKeys("Lord of Rings");


        WebElement book2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        book2.sendKeys("Harry Potter");

        WebElement book3=driver.findElement(By.xpath("//div[@class='row col-4-fields']/child::input[3]"));
        book3.sendKeys("The Last Kingdom");

        WebElement field1=driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        field1.sendKeys("War and Peace");

       WebElement field2=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        field2.sendKeys("HP1");

        WebElement field3=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        field3.sendKeys("HP2");

        WebElement grandParent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandParent.sendKeys("Jessica");

        WebElement parent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Amanda");

        WebElement child=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Emily");



    }
}
