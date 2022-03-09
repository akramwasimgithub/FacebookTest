package com.bridelabz;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

public class Screenshot {


    @Test
    public void captureScreenshot() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\63not\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        TakesScreenshot screenshot = (TakesScreenshot)  driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        //FileHandler.copy(srcFile, new File ( ."\\screenshot\\"+ System.currentTimeMillis()/1000 + "_facebook.jpg"));
        File desFile = new File(".\\screenshot\\" + System.currentTimeMillis() / 1000 + "_facebook.png");

        try {
            FileHandler.copy(srcFile, desFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
