package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Text {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.id("userName")).sendKeys("Anitha");
        driver.findElement(By.id("userEmail")).sendKeys("anitha1js17ec404@gmail.com");
        driver.findElement(By.cssSelector("textarea[placeholder=\"Current Address\"]")).sendKeys("Bangalore");
        driver.findElement(By.id("permanentAddress")).sendKeys("Channapattana");

//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable((WebElement) wait)).click();
//        Robot r =new Robot();
//        for(int i=0;i<=30;i++) {
//            r.keyPress(KeyEvent.VK_DOWN);
//            r.keyRelease(KeyEvent.VK_DOWN);
//        }
        Actions aa =new Actions(driver);
        aa.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.findElement(By.xpath("//button[@id='submit']")).click();


    }
}
