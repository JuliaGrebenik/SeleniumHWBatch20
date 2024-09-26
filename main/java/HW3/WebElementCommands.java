package HW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

//retrieve the text and print on the console
        WebElement txt=driver.findElement(By.xpath("//div[@id='textattr']"));
        System.out.println(txt.getText());

        //check if the checkbox is enabled
        WebElement radioButton1=driver.findElement(By.xpath("//input[@value='music_festival']"));
        boolean stateofR1=radioButton1.isEnabled();
        System.out.println("The radio button 1 is "+stateofR1);

        WebElement radioButton2=driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean stateofR2=radioButton2.isEnabled();
        System.out.println("The radio button 2 is "+stateofR2);

        //displayed
        WebElement radioButton3=driver.findElement(By.xpath("//label[@id='hiddenRadioLabel']"));
        boolean displayStateofR3=radioButton3.isDisplayed();
        System.out.println("Button 3 is displayed "+displayStateofR3);

        WebElement radioButtonVisibilityToogle=driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        radioButtonVisibilityToogle.click();

        displayStateofR3=radioButton3.isDisplayed();
        System.out.println("The radio button 3 is displayed "+displayStateofR3);

        //retrieve the value of the attribute tittle
        WebElement attributeTittle= driver.findElement(By.xpath("//div[@id='hidden_message']"));
String attributeVal=attributeTittle.getAttribute("data-text");
        System.out.println("The value of the atribute tittle is "+attributeVal);


        WebElement checkBox1=driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        boolean stateofCheckbox1=checkBox1.isEnabled();
        System.out.println("CheckBox 1 is "+stateofCheckbox1);
        checkBox1.click();

        WebElement checkBox2=driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        boolean stateofCheckbox2=checkBox2.isEnabled();
        System.out.println("CheckBox 2 is "+stateofCheckbox2);

        //clear the txt box and send the new txt
        WebElement inputBox=driver.findElement(By.xpath("//input[@id='inputField']"));
        inputBox.clear();
        inputBox.sendKeys("here is the custom text entered");



    }
}
