package Logindata;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static <TakeScreenshoot, TakeScreenshot> void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver anima = new ChromeDriver();
        anima.get("https://demoqa.com/select-menu");
        anima.manage().window().maximize();

        //Screenshoot
       TakesScreenshot ts=(TakesScreenshot)anima;
       File src=ts.getScreenshotAs(OutputType.FILE);
       File dst=new File(".//Suchi//Screenshoot.png");
       FileUtils.copyFile(src,dst);
    }
}
