package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver anima = new ChromeDriver();
        anima.get("https://demoqa.com/radio-button");
        anima.manage().window().maximize();

        WebElement ads = anima.findElement(By.xpath("//label[@class='custom-control-label'][1]"));
        ads.click();


    }
}