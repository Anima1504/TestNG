package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void loginPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Username");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("login")).click();

//        //New user
//        driver.findElement(By.id("newUser")).click();
//        driver.findElement(By.id("firstname")).sendKeys("Anitha");
//        driver.findElement(By.id("lastname")).sendKeys("M");
//        driver.findElement(By.cssSelector("input[placeholder=\"UserName\"]")).sendKeys("Anima");
//        driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("password");
//        driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
//        driver.findElement(By.id("register")).click();
    }

}
