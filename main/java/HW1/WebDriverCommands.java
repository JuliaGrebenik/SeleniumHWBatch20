package HW1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        String tittle1= driver.getTitle();
        System.out.println(tittle1);

        driver.navigate().to("https://syntaxprojects.com/");
        String tittle2=driver.getTitle();
        System.out.println(tittle2);

        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();

    }
}
