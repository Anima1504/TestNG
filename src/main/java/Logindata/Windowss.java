package Logindata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.Iterator;
import java.util.Set;

public class Windowss {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();


        //new Window
        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();

        String parent = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        for (String child : allwindows) {
            if (!parent.equals(child)) {
                driver.switchTo().window(child);
                driver.manage().window().maximize();
                Thread.sleep(3000);
                driver.close();
            }
        }
       // driver.switchTo().window(parent);


//        //New Tab
//        driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
//
//        String parentTab = driver.getWindowHandle();
//        Set<String> allwindowss = driver.getWindowHandles();
//        for (String tabchild : allwindowss) {
//            if (!parentTab.equals(tabchild)) {
//                driver.switchTo().window(tabchild);
//                Thread.sleep(3000);
////            driver.findElement(By.xpath("//*[@id=\"alertBox\"]")).click();
//                driver.findElement(By.xpath("//*[@id=\"alertBox\"]")).click();
//                driver.switchTo().alert().accept();
//            }
//        }
//        driver.switchTo().window(parentTab);
//       driver.findElement(By.xpath("//*[@id=\"newWindowsBtn\"]")).click();
//
//
//        //Multiple window
//        driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
//
//        String parent1=driver.getWindowHandle();
//        Set<String> allwindows1=driver.getWindowHandles();
//        Iterator<String> i1=allwindows1.iterator();
//        while(i1.hasNext()){
//            String child =i1.next();
//            if(!parent1.equals(child))
//            {
//                driver.switchTo().window(child);
//                System.out.println(driver.getTitle());
//                if(driver.getTitle().contains("XPath Practice - H Y R Tutorials")){
//                    driver.manage().window().maximize();
//                    driver.close();
//                }
//                else if(driver.getTitle().contains("Basic Controls - H Y R Tutorials")){
//                    driver.manage().window().maximize();
//                    driver.close();
//                }
//            }
//        }
//         driver.switchTo().window(parent);
        }
    }


