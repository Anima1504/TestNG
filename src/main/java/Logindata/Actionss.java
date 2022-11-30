package Logindata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver ani = new ChromeDriver();
        ani.get("https://demoqa.com/buttons");
        ani.manage().window().maximize();

        Actions mouse= new Actions(ani);
        WebElement aa=ani.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        mouse.doubleClick(aa).perform();

        WebElement bb=ani.findElement(By.xpath("//button[@id='rightClickBtn']"));
        mouse.contextClick(bb).perform();

        Thread.sleep(2000);
        ani.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        //text method
        // ani.findElement(By.xpath("(//button[text()='Click Me']")).click();
    }
}
