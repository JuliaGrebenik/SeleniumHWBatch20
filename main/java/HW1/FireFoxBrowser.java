package HW1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/");

        String url= driver.getCurrentUrl();
        String tittle=driver.getTitle();


        System.out.println("The url of the webpage is "+url);
        System.out.println("The tittle of the webpage is "+tittle);

        driver.close();




    }
}
