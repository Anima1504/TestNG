package Logindata;

import io.cucumber.java.en_old.Ac;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Framess {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        WebElement es=driver.findElement(By.tagName("iframe"));
        System.out.println(es.getTagName());
        //Single frame
        driver.switchTo().frame("frame1");
        WebElement ree=driver.findElement(By.id("sampleHeading"));
        System.out.println(ree.getText());
        driver.switchTo().defaultContent();

        Robot aa=new Robot();
        for(int i=0;i<7;i++) {
            aa.keyPress(KeyEvent.VK_DOWN);
            aa.keyRelease(KeyEvent.VK_DOWN);
        }
        driver.switchTo().frame("frame2");
        WebElement see=driver.findElement(By.id("sampleHeading"));
        System.out.println(see.getText());
    }
}
