package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App 
{
    public static void main( String[] args ){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver.get("https://cosmogid.ru");
        WebElement webElement = driver.findElement(By.xpath("//div[@class='lh_auth']/div[2]/a[contains(.,Вход)]"));
        driver.findElement(By.linkText("Вход")).click();
        driver.findElement(By.xpath("//*[@name='login']")).click();
        driver.findElement(By.xpath("//*[@name='login']")).sendKeys("luhan@inbox.ru");
        driver.findElement(By.xpath("//*[@name='password']")).click();
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("e7@ctG");
        driver.findElement(By.cssSelector(".uss_form_submit:nth-child(4)")).click();
        driver.findElement(By.xpath("//*[@name='sendloginform']")).click();


        driver.quit();
    }
}
