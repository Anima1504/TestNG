package Logindata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class FramesPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver ammu = new ChromeDriver();
        ammu.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        ammu.manage().window().maximize();

        ammu.findElement(By.xpath("//button[@id='newWindowBtn']")).click();

        //single window
        String parentt = ammu.getWindowHandle();
        Set<String> allwindowws = ammu.getWindowHandles();
        for (String child : allwindowws) {
            if (!parentt.equals(child)) {
                ammu.switchTo().window(child);
                ammu.manage().window().maximize();
                ammu.close();
            }
        }
        ammu.switchTo().window(parentt);
        ammu.quit();

        }

    }

