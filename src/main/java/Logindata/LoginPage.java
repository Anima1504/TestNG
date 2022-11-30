package Logindata;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email"));
//        Actions act =new Actions(driver);
//        act.keyDown(ele,Keys.SHIFT).sendKeys("Ani").keyUp(ele,Keys.SHIFT).build().perform();
        driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.id("pass"));
        driver.findElement(By.name("pass")).sendKeys("password");
        driver.findElement(By.id("loginbutton"));
        driver.findElement(By.name("login")).click();
    }
    }