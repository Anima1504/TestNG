package Logindata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Amazon{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver anima = new ChromeDriver();
        anima.get("https://www.amazon.in/");
        anima.manage().window().maximize();
        anima.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
