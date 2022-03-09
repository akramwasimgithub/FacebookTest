package com.bridelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {

    @Test
    public  void Test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\63not\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("5155wd");
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("wasim");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("akram");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("wass@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("12@qwas");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_day")).sendKeys("05");
        driver.findElement(By.name("birthday_month")).sendKeys("july");
        driver.findElement(By.name("birthday_year")).sendKeys("1996");
        driver.findElements(By.name("sex")).get(0).click();
        Thread.sleep(2000);
        System.out.println("title: "+ driver.getTitle());
       // driver.findElement(By.name("submit")).submit();
        System.out.println("current URL: "+ driver.getCurrentUrl());
       // driver.navigate().to("https://www.twitter.com/");
        driver.close();



    }
}
