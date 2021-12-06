package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver.get("https://diary.ru");

        driver.findElement(By.linkText("Регистрация")).click();
        driver.findElement(By.xpath("//*[@name='SignupForm[username]']")).click();
        driver.findElement(By.xpath("//*[@name='SignupForm[username]']")).sendKeys("Новая Запись3");
        driver.findElement(By.id("signupform-email")).click();
        driver.findElement(By.id("signupform-email")).sendKeys("66673@mail.ru");
        driver.findElement(By.id("chk_box_user_confirm")).click();
        driver.findElement(By.id("signup_btn")).click();

        driver.quit();
    }

}
