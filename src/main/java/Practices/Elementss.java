package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Elementss {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        //pagedown
        Actions mouse= new Actions(driver);
        mouse.sendKeys(Keys.PAGE_DOWN).build().perform();
        //clicking the element
        driver.findElement(By.xpath("(//div[@class=\"card mt-4 top-card\"])[1]")).click();
        //Click the  Checkbox
        Robot r =new Robot();
        for(int i=0; i<=5;i++){
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);}
        //clicking the check box
//       driver.findElement(By.xpath("(//li[@id=\"item-1\"])[1]")).click();
//       driver.findElement(By.cssSelector("svg[class=\"rct-icon rct-icon-expand-close\"]")).click();

        //Radio button
//        driver.findElement(By.xpath("(//li[@id='item-2'])[1]")).click();
//        driver.findElement(By.xpath("//label[text()='Impressive']")).click();

        //Webtable
        driver.findElement(By.xpath("(//li[@id=\"item-3\"])[1]")).click();
        driver.findElement(By.id("addNewRecordButton")).click();

    }
}








