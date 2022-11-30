package Logindata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");

       //Checkbox
        driver.findElement(By.cssSelector("svg[class=\"rct-icon rct-icon-uncheck\"]")).click();
        WebElement cb= driver.findElement(By.cssSelector("svg[class=\"rct-icon rct-icon-uncheck\"]"));

        cb.isEnabled();
        cb.isSelected();
      boolean flag = cb.isDisplayed();
       if (flag == true) {
            System.out.println("Already selected");
        } else {
           cb.click();
       }
        System.out.println("cb.isDisplayed()");
       driver.quit();
    }
    }

