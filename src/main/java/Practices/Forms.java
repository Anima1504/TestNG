package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

    public class Forms {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/");
            //Pagedown
            Actions mouse =new Actions(driver);
            mouse.sendKeys(Keys.PAGE_DOWN).build().perform();
            //Forms
            driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][2]")).click();
            driver.findElement(By.xpath("(//li[@id='item-0'])[2]")).click();

            driver.findElement(By.id("firstName")).sendKeys("Anitha");
            driver.findElement(By.id("lastName")).sendKeys("M");
            driver.findElement(By.id("userEmail")).sendKeys("anima1504@gmail.com");
            driver.findElement(By.xpath("//label[text()='Female']")).click();
            driver.findElement(By.id("userNumber")).sendKeys("9902515563");
            //dateofbirth
            driver.findElement(By.id("dateOfBirthInput")).click();

            Select month=new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
            month.selectByIndex(9);
            Select year=new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
            year.selectByValue("2022");
            driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]")).click();
            //driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
            //r.selectByIndex(8);

            Thread.sleep(2000);
            driver.findElement(By.id("subjectsContainer"));
            //driver.findElement(By.id("hobbiesWrapper"));
            //driver.findElement(By.xpath("//label[text()='Music']")).click();
            driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]")).sendKeys("C:\\Users\\AM64\\Documents\\Assesment.docx");
            driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Bangalore");

//            Thread.sleep(2000);
//            Actions mo= new Actions(driver);
//            mo.sendKeys(Keys.PAGE_DOWN).build().perform();
            Select city=new Select(driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")));
            city.selectByIndex(2);

        }
    }

