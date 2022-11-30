package Logindata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver anii = new ChromeDriver();
        anii.get(" https://demoqa.com/alerts");
        anii.manage().window().maximize();

//        Alerts
        anii.findElement(By.xpath("//button[@id='alertButton']")).click();
        Alert al=anii.switchTo().alert();
        al.accept();
        Thread.sleep(2000);

        //alert after 5sec
        anii.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
        WebDriverWait wait=new WebDriverWait(anii, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        anii.switchTo().alert().accept();

        //confirm accept
        anii.findElement(By.xpath("//button[@id='confirmButton']")).click();
        //anii.switchTo().alert().accept();
        anii.switchTo().alert().dismiss();

//        Promt alert accept
        anii.findElement(By.xpath("//button[@id='promtButton']")).click();
        Alert b= anii.switchTo().alert();
        b.sendKeys("Ani");
        b.accept();

         //Promt alert dismiss
        anii.findElement(By.xpath("//button[@id='promtButton']")).click();
        Alert b1= anii.switchTo().alert();
        b1.sendKeys("Ani");
        b1.dismiss();

    }
}
