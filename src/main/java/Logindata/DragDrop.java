package Logindata;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");       //launch the browser
        WebDriver chotu = new ChromeDriver();
        chotu.get("https://demo.guru99.com/test/drag_drop.html");
        chotu.manage().window().maximize();

        //Action of Drag and drop
        Actions ha = new Actions(chotu);
        WebElement src = chotu.findElement(By.xpath("//a[text()=' 5000 ']"));
        WebElement dst = chotu.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        ha.dragAndDrop(src, dst).build().perform();

        WebElement src1 = chotu.findElement(By.xpath("//a[text()=' 5000']"));
        WebElement dst1 = chotu.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
        ha.dragAndDrop(src1, dst1).build().perform();

        WebElement src2= chotu.findElement(By.xpath("//a[text()=' BANK ']"));
        WebElement dst2= chotu.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        ha.dragAndDrop(src2, dst2).build().perform();

        WebElement src3= chotu.findElement(By.xpath("//a[text()=' SALES ']"));
        WebElement dst3= chotu.findElement(By.xpath("//li[@class='placeholder']"));
        ha.dragAndDrop(src3, dst3).build().perform();

        Actions ch=new Actions(chotu);
        ch.sendKeys(Keys.PAGE_UP).build().perform();
        chotu.navigate().forward();
    }
}