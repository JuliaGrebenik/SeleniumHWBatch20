package HW5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        String mainPage=driver.getWindowHandle();
        System.out.println("The window handle of the main page is: "+mainPage);

        WebElement b1Btn=driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        b1Btn.click();

        Set<String> allHandles=driver.getWindowHandles();
        for (String handle:allHandles){
            driver.switchTo().window(handle);
            String URL=driver.getCurrentUrl();
            if (URL.equals("https://syntaxprojects.com/b1-page.php")){

                //find the text box and send some keys
                WebElement Box=driver.findElement(By.xpath("//h2[text()='Welcome to B! page']"));
                if (Box.getText().equals("Welcome to B1 page")){
                    System.out.println("The text in the window opened matched Welcome to B1 page");
                }else {
                    System.out.println("The text in the window opened does not match Welcome to B1 page. Bug found");
                }

                break;
            }
        }
        driver.switchTo().window(mainPage);

        WebElement b2Btn=driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        b2Btn.click();

        Set<String> allOtherHandles=driver.getWindowHandles();
        for (String handle1:allOtherHandles){
            driver.switchTo().window(handle1);
            String URL=driver.getCurrentUrl();
            if (URL.equals("https://syntaxprojects.com/b2-page.php")){
                //find the text box and send some keys
                WebElement Box=driver.findElement(By.xpath("//h2[text()='Welcome to B2 page']"));
                if (Box.getText().equals("Welcome to B2 page")){
                    System.out.println("The text in the window opened matched Welcome to B2 page");
                }else {
                    System.out.println("The text in the window opened does not match Welcome to B2 page. Bug found");
                }

                break;
            }
        }



    }
}
