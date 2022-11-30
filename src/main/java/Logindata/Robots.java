package Logindata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Robots {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver chai=new ChromeDriver();
        chai.get("https://demoqa.com/books");
        chai.manage().window().maximize();

       //Pagedown
        Robot r=new Robot();
        for(int i=0;i<=16;i++) {
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_DOWN);
        }

        //page enter
        Robot r1=new Robot();
        r1.keyPress(KeyEvent.VK_ENTER);
        r1.keyRelease(KeyEvent.VK_ENTER);

        //Copy paste
        Robot r3=new Robot();
        r3.keyPress(KeyEvent.VK_CONTROL);
        r3.keyPress(KeyEvent.VK_C);
        r3.keyRelease(KeyEvent.VK_CONTROL);
        r3.keyRelease(KeyEvent.VK_C);

        //PASTE
        Robot r4=new Robot();
        r4.keyPress(KeyEvent.VK_CONTROL);
        r4.keyPress(KeyEvent.VK_V);
        r4.keyRelease(KeyEvent.VK_CONTROL);
        r4.keyRelease(KeyEvent.VK_V);
    }
}
