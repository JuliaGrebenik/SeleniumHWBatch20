package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();

                driver.manage().window().maximize();
                driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

        WebElement yourHobbies=driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        yourHobbies.sendKeys("reading");

        WebElement clickBtn=driver.findElement(By.xpath("//button[@id='display_text']"));
        clickBtn.click();

        WebElement favoriteMovies=driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        favoriteMovies.sendKeys("God Father");

        WebElement paragraph=driver.findElement(By.xpath(" //label[contains(text(),'Lorem ')]"));
        String textOfString=paragraph.getText();
        System.out.println(textOfString);

        WebElement yourCity=driver.findElement(By.xpath("//input[@id='yourCity']"));
        yourCity.sendKeys("Arlington");

        WebElement pEmail=driver.findElement(By.xpath("(//input[@id='PersonalEmailID'])[1]"));
        pEmail.sendKeys("j@example.com");

        WebElement oEmail=driver.findElement(By.xpath(" (//input[@name='OfficeEmail'])[1]"));
        oEmail.sendKeys("o@example.com");

        WebElement proEmail=driver.findElement(By.xpath("(//input[@id='ProfessionalEmailID'])[1]"));
        proEmail.sendKeys("pro@example.com");

        WebElement clientName=driver.findElement(By.xpath("//input[@data-detail='one' and @class='form-control']"));
        clientName.sendKeys("John Doe");

        WebElement clientId=driver.findElement(By.xpath("//input[@name='clientId' and @id='clientId']"));
        clientId.sendKeys("JohnDoe123");

        WebElement streetNumber=driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNumber.sendKeys("123 Constitution");

        WebElement houseNumber=driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNumber.sendKeys("567");






    }
}
