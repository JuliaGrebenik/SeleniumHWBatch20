package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");



        WebElement userId=driver.findElement(By.cssSelector("input#UserID"));
        userId.sendKeys("JohnDoe123");

        WebElement userName=driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("John Doe");

        WebElement introToLecture=driver.findElement(By.cssSelector("input[data-starts^='intro']"));
        introToLecture.sendKeys("Hello");

        WebElement feedbackFromRay=driver.findElement(By.cssSelector("input#FeedbackFromRay"));
        feedbackFromRay.sendKeys("Course is great");

        WebElement feedbackFromDucky=driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
        feedbackFromDucky.sendKeys("Course is awesome");

        WebElement clientId=driver.findElement(By.cssSelector("input[data-ends$='ID']"));
        clientId.sendKeys("123456");

        WebElement email=driver.findElement(By.cssSelector("input[name$='l']"));
        email.sendKeys("j@example.com");

        WebElement courseTopic=driver.findElement(By.cssSelector("input[name$='Topic']"));
        courseTopic.sendKeys("Selenium");






    }
}
