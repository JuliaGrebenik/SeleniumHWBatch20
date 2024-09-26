package HW4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");


        WebElement DD=driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));

        Select sel=new Select(DD);
        sel.selectByIndex(3);

        List<WebElement>allOptions=sel.getOptions();
        for(WebElement all:allOptions){
            System.out.println(all.getText());
        }

        WebElement MultiSelectDD=driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select selectMultiple=new Select(MultiSelectDD);
        boolean Multi=selectMultiple.isMultiple();
        System.out.println("The dropdown is multiselect "+Multi);

        selectMultiple.selectByIndex(1);
        selectMultiple.selectByValue("Cooking");
        selectMultiple.selectByVisibleText("Gardening");

        List<WebElement>allSelected=selectMultiple.getAllSelectedOptions();
        for(WebElement all:allSelected){
            System.out.println(all.getText());
        }

        Thread.sleep(5000);
        selectMultiple.deselectByValue("Traveling");

        List<WebElement>allSelected1=selectMultiple.getAllSelectedOptions();
        for(WebElement all:allSelected1){
            System.out.println(all.getText());
        }


    }
}
