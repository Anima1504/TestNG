package Logindata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class NestedFramess {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();

        //Switching to parent
        driver.switchTo().frame("frame1");
        //get the text in parent
        WebElement dsd=driver.findElement(By.xpath("//body[text()='Parent frame']"));//
        System.out.println(dsd.getText());


        //switching to child
       // WebElement sss=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
       // driver.switchTo().frame(sss);
        driver.switchTo().frame(0);
        //Getting the text from the child
        WebElement asd=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println(asd.getText());

//        driver.switchTo().parentFrame();
//        WebElement dsd1=driver.findElement(By.xpath("//body[text()='Parent frame']"));//
//        System.out.println(dsd1.getText());

        driver.switchTo().defaultContent();
        System.out.println(driver.getTitle());
    }
}
