package Logindata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();

        //Single dropdown
         WebElement dpdn=driver.findElement(By.xpath("//select[@id='course']"));
        // Create object of the Select class
        Select se = new Select(dpdn);

        // Select the option by index
        se.selectByIndex(2);
        se.selectByValue("java");
        se.selectByVisibleText("Python");

        // Multiple dropdown
       WebElement eles =driver.findElement(By.xpath("//select[@id='ide']"));
        Select es = new Select(eles);
        es.selectByIndex(3);
        es.selectByIndex(1);

        // get title
        String s=driver.getTitle();
       System.out.println(driver.getTitle());

        //get currenturl
        System.out.println(driver.getCurrentUrl());

    }
}
